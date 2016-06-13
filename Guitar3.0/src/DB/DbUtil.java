package DB;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class DbUtil{
		
		static Connection conn=null;
		public static Connection getConnection(){
			try{
				Class.forName("org.sqlite.JDBC");	
				conn = DriverManager.getConnection("jdbc:sqlite:D:/study/系统分析与设计/guitarV2.db");
			}catch(ClassNotFoundException e){
				
			}		
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
}