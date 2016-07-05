package Dao;

import java.util.HashMap;

import Model.Professor;

public interface PersonDao {
	public HashMap<String, Professor> findAllProfessors();

}
