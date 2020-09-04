package Schedules;

import Main.*;

public class ChrisSchedule extends Schedule {
	
	public ChrisSchedule() {
		description = "Chris' Schedule";
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

