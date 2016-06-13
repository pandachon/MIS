package Factory;

import Dao.guitarDao;
import Dao.inventoryDao;
import DaoImpl.MysqlGuitarImpl;
import DaoImpl.MysqlInventoryImpl;

public class MysqlFactory  implements Idao {
	
	@Override
	public guitarDao GetGuitarInstance() throws Exception {
		// TODO Auto-generated method stub
		return new MysqlGuitarImpl();
	}
	@Override
	public inventoryDao GetInventoryInstance() throws Exception {
		// TODO Auto-generated method stub
		return new MysqlInventoryImpl();
	}

}
