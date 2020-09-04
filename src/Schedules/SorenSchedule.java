package Schedules;

import Main.*;

public class SorenSchedule extends Schedule {
	
	public SorenSchedule() {
		description = "Soren's Schedule";
	}
	
	public String getClasses(){
		return "Classes: ";
	}

	public String getJobs() {
		return "Jobs: ";
	}

	public String getActivities() {
		return "Activities: ";
	}
}

