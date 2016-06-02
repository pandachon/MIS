package DB;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

	public class DbUtil implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public Connection connection = null;
		
		public DbUtil(){
			try {
				Class.forName("org.sqlite.JDBC");
				connection= DriverManager.getConnection("jdbc:sqlite:D:/study/系统分析与设计/guitarV2.db");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}


