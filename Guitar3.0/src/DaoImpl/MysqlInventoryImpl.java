package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DB.DataConnect;
import Dao.inventoryDao;
import model.Builder;
import model.Guitar;
import model.GuitarSpec;
import model.Type;
import model.Wood;

public class MysqlInventoryImpl  implements inventoryDao {
	@Override
	public List<Guitar> loaddata() throws Exception {
		// TODO Auto-generated method stub
	
		//泛型
				List<Guitar> result = new ArrayList<Guitar>();
				String sql = "select * from Guitar where 1=1 ";
				Connection conn=DataConnect.getConnection("mysql");
				PreparedStatement ptmt = conn.prepareStatement(sql);
				ResultSet rs = ptmt.executeQuery();
				Guitar guitar = null;
				while (rs.next()) {
						guitar=new Guitar(rs.getString("serialNumber"),rs.getDouble("price"), rs.getString("model"),rs.getInt("numStrings"),
								new GuitarSpec(Builder.valueOf(rs.getString("builder")),  Type.valueOf(rs.getString("type")), 
										Wood.valueOf(rs.getString("backwood")), Wood.valueOf(rs.getString("topwood"))));
				result.add(guitar);
				}
				ptmt.close();
				return result;	
	}		
}
