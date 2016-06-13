package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import DB.DataConnect;
import Dao.guitarDao;
import model.Guitar;

public class SqliteGuitarImpl  implements guitarDao{

	@Override
	public boolean addGuitar(Guitar guitar) throws Exception {
		// TODO Auto-generated method stub
		boolean a=false;
		String sql = "insert into Guitar (serialNumber,backWood,topWood,price,builder,type) values (?,?,?,?,?,?) ";
		Connection conn=DataConnect.getConnection("sqlite");
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setDouble(1, guitar.getPrice());
		ptmt.setString(2, guitar.getSerialNumber());
		if (ptmt.executeUpdate()>0) {
		a=true;	
		}
		ptmt.close();
		return a;	
	}



	@Override
	public boolean delGuitar(String serialNumber) throws Exception {
		// TODO Auto-generated method stub
		boolean a=false;
		String sql = "delete from Guitar where serialNumber=? ";
		Connection conn=DataConnect.getConnection("sqlite");
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1,serialNumber );
		if (ptmt.executeUpdate()>0) {
		a=true;	
		}
		ptmt.close();
		return a;	
	}
	
}
