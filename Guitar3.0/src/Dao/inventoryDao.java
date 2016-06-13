package Dao;

import java.util.List;

import model.Guitar;

public interface inventoryDao {
	public List<Guitar> loaddata() throws Exception;
}
