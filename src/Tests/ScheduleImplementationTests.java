package Tests;

import org.junit.Assert;
import org.junit.Test;

import Decorators.*;
import Main.*;
import Schedules.*;

public class ScheduleImplementationTests {

	@Test
	public void TestAmyDescription() {
		Schedule schedule = new AmySchedule();
		Assert.assertEquals(schedule.getDescription(), "Amy's Schedule");
	}
	
	@Test
	public void TestChrisDescription() {
		Schedule schedule = new ChrisSchedule();
		Assert.assertEquals(schedule.getDescription(), "Chris' Schedule");
	}
	
	@Test
	public void TestCrewDescription() {
		Schedule schedule = new CrewSchedule();
		Assert.assertEquals(schedule.getDescription(), "Crew's Schedule");
	}
	
	@Test
	public void TestSorenDescription() {
		Schedule schedule = new SorenSchedule();
		Assert.assertEquals(schedule.getDescription(), "Soren's Schedule");
	}

	@Test
	public void TestAmyScheduleClasses() {
		Schedule schedule = new AmySchedule();
		schedule = new ArtClass(schedule);
		schedule = new MathClass(schedule);
		Assert.assertEquals(ScheduleHelper.TrimList(schedule.getClasses()), "Classes: Art, Math");
	}

	@Test
	public void TestSorenScheduleActivities() {
		Schedule schedule = new SorenSchedule();
		schedule = new BaseballActivity(schedule);
		schedule = new MovingVehicleActivity(schedule);
		Assert.assertEquals(ScheduleHelper.TrimList(schedule.getActivities()), "Activities: Baseball, Cars, Helicopters, Trains");
	}

	@Test
	public void TestChrisScheduleJobs() {
		Schedule schedule = new ChrisSchedule();
		schedule = new FacilityOperatorJob(schedule);
		Assert.assertEquals(ScheduleHelper.TrimList(schedule.getJobs()), "Jobs: Facility Operator");
	}

	@Test
	public void TestCrewMultipleSchedules() {
		Schedule schedule = new CrewSchedule();
		schedule = new TeethingActivity(schedule);
		schedule = new ArtClass(schedule);
		Assert.assertEquals(ScheduleHelper.TrimList(schedule.getActivities()), "Activities: Teething");
		Assert.assertEquals(ScheduleHelper.TrimList(schedule.getClasses()), "Classes: Art");
	}

	@Test
	public void TestAmyMultipleSchedules() {
		Schedule schedule = new AmySchedule();
		schedule = new BaseballActivity(schedule);
		schedule = new ComputerScienceClass(schedule);
		schedule = new SoftwareEngineerJob(schedule);
		Assert.assertEquals(ScheduleHelper.TrimList(schedule.getActivities()), "Activities: Baseball");
		Assert.assertEquals(ScheduleHelper.TrimList(schedule.getJobs()), "Jobs: Software Engineer");
		Assert.assertEquals(ScheduleHelper.TrimList(schedule.getClasses()), "Classes: Computer Science");
	}

	@Test
	public void TestSorenMultipleSchedules() {
		Schedule schedule = new SorenSchedule();
		schedule = new BaseballActivity(schedule);
		schedule = new MovingVehicleActivity(schedule);
		schedule = new MathClass(schedule);
		schedule = new ArtClass(schedule);
		schedule = new ScienceClass(schedule);
		schedule = new ComputerScienceClass(schedule);
		Assert.assertEquals(ScheduleHelper.TrimList(schedule.getActivities()), "Activities: Baseball, Cars, Helicopters, Trains");
		Assert.assertEquals(ScheduleHelper.TrimList(schedule.getClasses()), "Classes: Math, Art, Science, Computer Science");
	}
}
