package Decorators;

import Main.*;
import Enums.*;

public class MathClass extends ScheduleDecorator{
	Schedule schedule;
	String value = Classes.Math.toString();
	
	public MathClass(Schedule schedule) {
		this.schedule = schedule;
	}
	
	public String getDescription() {
		return this.schedule.getDescription();
	}
	
	public String getClasses(){
		return this.schedule.getClasses() + value + ", ";
	}

	public String getJobs() {
		return this.schedule.getJobs();
	}

	public String getActivities() {
		return this.schedule.getActivities();
	}
}
