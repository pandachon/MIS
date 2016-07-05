package Model;

import java.util.HashMap;

import Model.Course;

public class CourseCatalog {
	private HashMap<String, Course> courses;


	public CourseCatalog() {

		courses = new HashMap<String, Course>();
	}
	
	public CourseCatalog(HashMap<String, Course> courses) {

		this.courses = courses;
	}


	public void display() {

		for (Course c : courses.values()) {
			c.display();
			System.out.println();
		}
	}

	public void addCourse(Course c) {
		// We use the course no. as the key.

		String key = c.getCourseNo();
		courses.put(key, c);
	}

	public Course findCourse(String courseNo) {
		return courses.get(courseNo);
	}

	public boolean isEmpty() {
		if (courses.size() == 0) return true;
		else return false;
	}
}
