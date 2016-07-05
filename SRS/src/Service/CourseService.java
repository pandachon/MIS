package Service;

import Dao.CourseDao;
import Model.Course;
import Model.CourseCatalog;

public class CourseService {
	private static CourseCatalog  courses;
	private CourseDao courseDao = null;
	
	public CourseService(CourseDao dao){
		this.courseDao = dao;
		courses = new CourseCatalog(dao.findAll());
	}

	public CourseCatalog getCourseCatalog() {
		return courses;
	}
	
	public Course findCourse(String courseNo){
	   return courses.findCourse(courseNo);
	}
}
