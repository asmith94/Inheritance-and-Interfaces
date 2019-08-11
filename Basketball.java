/***************************** Inheritance and Interfaces ***********************
Program by: Austin Smith
Purpose:
	This class is an extention of the "Player" class. They are both implementing
	the "Athlete" interface. This class creates a "Basketball", who is a "Player",
	which are all "Athlete"s.
Results:
	We now have a "Basketball" class that uses the super(name, number, salary) 
	to create an extended "Player" class. We have to make an extended "Player" class
	because we made that class abstract. It fits with our analogy as well because 
	A "Player" is an "Athlete", but if a "Player" doesn't play a specific sport 
	then  he is not actually an "Athlete". We have to have the sport class which
	will extend from "Player". We add a private field percentFT which is the percentage of
	free throws that the player has, and another private field called team which is
	the name of the team. We have a couple of methods that we added that allow us to 
	set the name of the team and add free throws as well which protects our encapsulation.
********************************************************************************/

public class Basketball extends Player {
	private double percentFT;
	private String team;

	// we always prime our variables to make sure that we do not get weird results
	public Basketball(String name, int number, double salary){
		super(name, number, salary);
		this.percentFT = 0;
		this.team = "";
	}

	public String getTeamName() {
		return this.team;
	}

	public void setTeamName(String name) {
		this.team = name;
	}

	public double getFreeThrow() {
		return this.percentFT;
	}

	public void setFreeThrow(double num) {
		if (num < 0 || num > 1) {
			System.out.println("ERR_FREETHROW_INCORRECT_INPUT");
			return;
		}
		this.percentFT = (this.percentFT + num) / 2;
	}
}