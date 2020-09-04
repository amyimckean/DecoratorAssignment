package Decorators;

import Main.*;
import Enums.*;

public class TeethingActivity extends ScheduleDecorator{
	Schedule schedule;
	String value = Activities.Teething.toString();
	
	public TeethingActivity(Schedule schedule) {
		this.schedule = schedule;
	}
	
	public String getDescription() {
		return this.schedule.getDescription();
	}
	
	public String getClasses(){
		return this.schedule.getClasses();
	}

	public String getJobs() {
		return this.schedule.getJobs();
	}

	public String getActivities() {
		return this.schedule.getActivities() + value + ", ";
	}
}
