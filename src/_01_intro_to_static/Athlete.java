package _01_intro_to_static;

	public class Athlete {
	    static int nextBibNumber = 0;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        this.bibNumber = nextBibNumber;
	        nextBibNumber++;
	    }

	   public static void main(String[] args) {
		
	
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    	Athlete athlete1 = new Athlete("Jerry", 3);
	    		
	    	Athlete athlete2 = new Athlete("Jarvis", 4);
	    }
	}
