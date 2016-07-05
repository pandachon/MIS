package Service;

import Dao.SectionDao;
import Model.ScheduleOfClasses;

public class ScheduleOfClassesService {
    private static ScheduleOfClasses sc;
	private SectionDao sectionDao = null;
    
    public ScheduleOfClasses getScheduleOfClasses() {
		return sc;
	}    
    
    public ScheduleOfClassesService(String semester, SectionDao dao){
    	sc = new ScheduleOfClasses(semester, dao.findBySemester(semester));
    }
}
