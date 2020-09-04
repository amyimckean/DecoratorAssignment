package Main;

public class ScheduleHelper {
	
	public static String TrimList(String list) {
		if(!list.contains(",")) {
			return list + "None";
		}
		else {
			return list.substring(0, list.lastIndexOf(","));
		}
	}

}
