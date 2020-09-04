package Enums;

public enum Activities {
	Baseball("Baseball"),
	CarsHelicoptersTrains("Cars, Helicopters, Trains"),
	Hiking("Hiking"),
	Teething("Teething"),
	None("None");
	
    public final String label;
	 
    private Activities(String label) {
        this.label = label;
    }
    
    public String toString() {
    	return this.label;
    }
}
