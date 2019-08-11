/***************************** Inheritance and Interfaces ***********************
Program by: Austin Smith
Purpose:
	This class is another variant of the "Player" class. It shows us how we can have 
	two different types of extended classes, which both take the abstract methods and
	constructor from their superclss. 
Results:
	We now have another subclass of the "Player" class, which is a tennis player class.
	This class uses the constructor of it's superclass, which gives each tennis player
	a name, a number, and a salary. We also add two data fields for each tennis player,
	which are "wins" and "topSpeed" which store the number of wins and the top speed of
	the player's fastest serve, respectively. Since we are protecting our data fields
	by using encapsulation, the data fields will be private. Each data field has a
	getter method which returns the value, and a setter method which will add or 
	set the new value.
********************************************************************************/

public class Tennis extends Player {
	private int wins;
	private double topSpeed;

	// priming our variables to ensure no bugs or incorrect values
	public Tennis(String name, int number, double salary){
		super(name,number,salary);
		this.wins = 0;
		this.topSpeed = 0;
	}

	public double getSpeed() {
		return this.topSpeed;
	}

	public void setSpeed(double speed) {
		if (speed < 0) {
			System.out.println("ERR_SPEED_NEGATIVE_VALUE");
			return;
		}
		this.topSpeed = speed;
	}

	public int getWins() {
		return this.wins;
	}

	public void addWins(int wins) {
		this.wins += wins;
	}
}
