package Schedules;

import Main.*;

public class AmySchedule extends Schedule {
	
	public AmySchedule() {
		description = "Amy's Schedule";
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

