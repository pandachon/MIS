package SearchMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DB.DbUtil;
import Dao.guitardao;

public class guitarsearch {
	public static List<guitardao> Query(String keyw) throws Exception{
		List<guitardao> result=new ArrayList<guitardao>();
		Connection conn=DbUtil.getConnection();
		StringBuilder sb=new StringBuilder();
		sb.append("select * from guitar1 where serialNumber=? or price=? or builder=? or model=? or type=? or backWood=? or topWood=?");
		PreparedStatement ptmt=conn.prepareStatement(sb.toString());
		ptmt.setString(1, keyw);
		ptmt.setString(2, keyw);
		ptmt.setString(3, keyw);
		ptmt.setString(4, keyw);
		ptmt.setString(5, keyw);
		ptmt.setString(6, keyw);
		ptmt.setString(7, keyw);
		ResultSet rs=ptmt.executeQuery();
		guitardao g=null;
		while(rs.next()){
			g = new guitardao();
			g.setSerialNumber(rs.getString("serialNumber"));
			g.setPrice(rs.getDouble("price"));
			g.setBuilder(rs.getString("builder"));
			g.setModel(rs.getString("model"));
			g.setType(rs.getString("type"));
			g.setBackWood(rs.getString("backWood"));
			g.setTopWood(rs.getString("topWood"));
			result.add(g);
		}
		return result;

	}
}
