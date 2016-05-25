package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	static String url="jdbc:sqlserver://localhost:1433; DatabaseName=Shop";
	static String userName="sa";
	static String password="123456";
	static Connection con=null;
	public static Connection getConnection(){
		
		try{
			//硬编码
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
			con=DriverManager.getConnection(url,userName,password);
		}catch(ClassNotFoundException e){
			
		}		//建立到数据库的连接
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

}
