package Enums;

public enum Jobs {
	SoftwareEngineer("Software Engineer"),
	FacilityOperator("Facility Operator"),
	None("None");
	
    public final String label;
	 
    private Jobs(String label) {
        this.label = label;
    }
    
    public String toString() {
    	return this.label;
    }
}
