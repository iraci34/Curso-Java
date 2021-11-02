package entities;

public class Student {

	public String name;
	public double trim1;
	public double trim2;
	public double trim3;
	
	public double finalGrade() {
		return trim1 + trim2 + trim3;
	}
    public double missingPoints() {
    	if (finalGrade() < 60.0) {
    		return 60.0 - finalGrade();
    	}
    	else {
    		return 0.0;
    	}
    }
 }
