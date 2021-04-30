package _01_intro_to_static;

public class RunningRace {
	public static class Athlete {
	    static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed, int bibNumber){
	        this.name = name;
	        this.speed = speed;
	        this.bibNumber = nextBibNumber;
	    }

	    public static void main(String[] args) {
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    	Athlete athlete1 = new Athlete("Jerry", 3, nextBibNumber) {
	    		return "Jerry // " + nextBibNumber + " // " + raceLocation;
	    		nextBibNumber++;
	    	}
	    	Athlete athlete2 = new Athlete("Jarvis", 4, nextBibNumber) {
	    		return "Jarvis // " + nextBibNumber + " // " + raceLocation;
	    		nextBibNumber++;
	    	}
	    }
	}
}
