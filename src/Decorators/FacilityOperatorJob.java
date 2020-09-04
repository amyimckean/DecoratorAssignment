package Decorators;

import Main.*;

import Enums.*;

public class FacilityOperatorJob extends ScheduleDecorator{
	Schedule schedule;
	String value = Jobs.FacilityOperator.toString();
	
	public FacilityOperatorJob(Schedule schedule) {
		this.schedule = schedule;
	}
	
	public String getDescription() {
		return this.schedule.getDescription();
	}
	
	public String getClasses(){
		return this.schedule.getClasses();
	}

	public String getJobs() {
		return this.schedule.getJobs() + value + ", ";
	}

	public String getActivities() {
		return this.schedule.getActivities();
	}
}