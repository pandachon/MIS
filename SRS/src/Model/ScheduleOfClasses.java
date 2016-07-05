package Model;

import java.util.HashMap;

import Model.Section;

public class ScheduleOfClasses {
	private String semester;


	private HashMap<String, Section> sectionsOffered; 


	public ScheduleOfClasses(String semester) {
		setSemester(semester);
		

		sectionsOffered = new HashMap<String, Section>();
	}

	public ScheduleOfClasses(String semester, HashMap<String, Section> sectionsOffered ) {
		setSemester(semester);
		

		this.sectionsOffered = sectionsOffered;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getSemester() {
		return semester;
	}

	public HashMap<String, Section> getSectionsOffered() {
		return sectionsOffered;
	}


	public void display() {
		System.out.println("Schedule of Classes for " + getSemester());
		System.out.println();


		for (Section s : sectionsOffered.values()) {
			s.display();
			System.out.println();
		}
	}

	public void addSection(Section s) {

		String key = s.getRepresentedCourse().getCourseNo() + 
			     " - " + s.getSectionNo();
		sectionsOffered.put(key, s);


		s.setOfferedIn(this);
	}

	public Section findSection(String fullSectionNo) {
		return sectionsOffered.get(fullSectionNo);
	}

	public boolean isEmpty() {
		if (sectionsOffered.size() == 0) return true;
		else return false;
	}
}
