package Factory;

import Dao.guitarDao;
import Dao.inventoryDao;

public interface Idao {
	public  guitarDao GetGuitarInstance() throws Exception;
	public  inventoryDao GetInventoryInstance() throws Exception;
}
