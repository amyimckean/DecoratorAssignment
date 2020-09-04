package Schedules;

import Main.*;

public class CrewSchedule extends Schedule {
	
	public CrewSchedule() {
		description = "Crew's Schedule";
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

