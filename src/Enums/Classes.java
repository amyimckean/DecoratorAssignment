package Enums;

public enum Classes {
	Math("Math"),
	Science("Science"),
	Bible("Bible"), 
	English("English"), 
	ComputerScience("Computer Science"), 
	History("History"),
	Art("Art"),
	None("None");
	
    public final String label;
	 
    private Classes(String label) {
        this.label = label;
    }
    
    public String toString() {
    	return this.label;
    }
}
