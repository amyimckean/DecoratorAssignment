package Main;

import Schedules.*;
import Decorators.*;

public class Main {

	public static void main(String[] args) {
		Schedule soren = GetSorenSchedule();
		Schedule crew = GetCrewSchedule();
		Schedule chris = GetChrisSchedule();
		Schedule amy = GetAmySchedule();
		PrintSchedule(soren);
		PrintSchedule(crew);
		PrintSchedule(chris);
		PrintSchedule(amy);
	}
	
	
	public static Schedule GetSorenSchedule() { 
		Schedule soren = new SorenSchedule(); 
		soren = new MovingVehicleActivity(soren); 
		soren = new BaseballActivity(soren); 
		soren = new MathClass(soren); 
		soren = new ScienceClass(soren);
		return soren; 
	}
  
	public static Schedule GetCrewSchedule() { 
		Schedule crew = new CrewSchedule(); 
		crew = new ArtClass(crew); 
		crew = new TeethingActivity(crew);
		return crew; 
	} 
	
	public static Schedule GetAmySchedule() {
		Schedule amy = new AmySchedule();
		amy = new ComputerScienceClass(amy);
		amy = new BaseballActivity(amy);
		amy = new SoftwareEngineerJob(amy);
		return amy;
	}
	
	
	public static Schedule GetChrisSchedule() {
		Schedule chris = new ChrisSchedule();
		chris = new BaseballActivity(chris);
		chris = new FacilityOperatorJob(chris);
		return chris;
	}
	
	public static void PrintSchedule(Schedule schedule) {
		System.out.println(schedule.getDescription());
		System.out.println(ScheduleHelper.TrimList(schedule.getClasses()));
		System.out.println(ScheduleHelper.TrimList(schedule.getActivities()));
		System.out.println(ScheduleHelper.TrimList(schedule.getJobs()) + "\n");
	}


}
