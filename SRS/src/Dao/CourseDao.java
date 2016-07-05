package Dao;

import java.util.HashMap;

import Model.Course;

public interface CourseDao {
	public HashMap<String, Course> findAll();

}
