/***************************** Inheritance and Interfaces ***********************
Program by: Austin Smith
Purpose:
	This is a class which will showcase our "Athlete" tree of classes. We will test the 
	methodss and constructors of our classes to make sure that we wrote correct code.
Results:
	We created two instances of the 2 classes we wrote, one for tennis player Rodger
	Federer, and one for basketball player Tim Duncan. We used the constructors for the 
	classes, which is the constructor of the "Player" class. We then updated the data
	fields for each instance of the class, since they are only primed when the classes
	are constructed. We finally print the data, then altering the data fields again 
	with a final print.
********************************************************************************/
public class AthleteDriver {
	
	public static void main(String[] args) {
		/*
			This is our first athlete, the tennis player Rodger Federer
		*/
			String tennis1Name = "Rodger Federer";
			int tennis1Number = 3;					// since tennis is not a team sport, the number of Federer will be his ATP ranking
			double tennis1Salary = 77200000;
			int tennis1Wins = 110;					// in singles and doubles for career finals
			double tennis1TopSpeed = 230;   		// in km/h
	
			Tennis tennis1 = new Tennis(tennis1Name, tennis1Number, tennis1Salary);

			// since the top speed and wins are at 0, we need to set the correct values
			tennis1.setSpeed(tennis1TopSpeed);

			tennis1.addWins(tennis1Wins);

		/*
			This is our second athlete, the basketball player Tim Duncan
		*/

			String bball1Name = "Tim Duncan";
			int bball1Number = 21;
			double bball1Salary = 5000000;
			double bball1PercentFT = 0.696;
			String bball1Team = "Spurs";			// even though Tim is retired, he will always be a Spur!

			Basketball bball1 = new Basketball(bball1Name, bball1Number, bball1Salary);

			bball1.setTeamName(bball1Team);

			bball1.setFreeThrow(bball1PercentFT);

			// printing our tennis data
			System.out.println("*****First Player*****");
			System.out.println(tennis1.getName());
			System.out.println("Salary = " + tennis1.getSalary());
			System.out.println("Number = " + tennis1.getNumber());
			System.out.println("Wins = " + tennis1.getWins());
			System.out.println("Fastest Serve Speed = " + tennis1.getSpeed());

			tennis1.addWins(2);

			System.out.println("New Wins = " + tennis1.getWins());

			System.out.println();

			// printing our Basketball data
			System.out.println("*****Second Player*****");
			System.out.println(bball1.getName());
			System.out.println("Salary = " + bball1.getSalary());
			System.out.println("Number = " + bball1.getNumber());
			System.out.println("Team Name = " + bball1.getTeamName());
			System.out.println("Free Throw Percentage = " + bball1.getFreeThrow());

			bball1.setFreeThrow(0.723);

			System.out.println("New Free Throw Percentage = " + bball1.getFreeThrow());
	}
}