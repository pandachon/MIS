package Dao;

import java.util.HashMap;
import java.util.List;

import Model.Section;

public interface SectionDao {
	public List<Section> findAll();
	public HashMap<String,Section> findBySemester(String semester);
}
