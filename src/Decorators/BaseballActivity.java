package Decorators;

import Main.*;
import Enums.*;

public class BaseballActivity extends ScheduleDecorator{
	Schedule schedule;
	String value = Activities.Baseball.toString();
	
	public BaseballActivity(Schedule schedule) {
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
