package Main;

public abstract class Schedule {
	public String description;
	
	public String getDescription() {
		return description;
	}
	
	public abstract String getClasses();
	public abstract String getJobs();
	public abstract String getActivities();
}
