package Dao;

import java.util.List;

import model.Guitar;

public interface guitarDao {
	public boolean addGuitar(Guitar guitar) throws Exception;
	public boolean delGuitar(String serialNumber) throws Exception;
}
