package Factory;

import Dao.guitarDao;
import Dao.inventoryDao;
import DaoImpl.SqliteGuitarImpl;
import DaoImpl.SqliteInventoryImpl;

public class SqliteFactory implements Idao {

		@Override
		public guitarDao GetGuitarInstance() throws Exception {
			// TODO Auto-generated method stub
			return new SqliteGuitarImpl();
		}

		@Override
		public inventoryDao GetInventoryInstance() throws Exception {
			// TODO Auto-generated method stub
			return new SqliteInventoryImpl();
		}

}
