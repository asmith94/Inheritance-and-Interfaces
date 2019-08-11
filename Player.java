/***************************** Inheritance and Interfaces ***********************
Program by: Austin Smith
Purpose:
	This is an abstract class that implements the "Athlete" interface we created.
	By implementing the interface, we guarantee that the methods listed in the
	interface are going to be implemented here. The abstract nature of this class
	means that it is more of a guide that can be extended by classes to reuse its
	code.
Results:
	We have created potential classes that will extend from this one. They will share 
	methods and the extended classes will be able to add their own as well. We implement 
	the getName() getNumber() and getSalary() methods from our interface.
********************************************************************************/


public abstract class Player implements Athlete {
	private String name;
	private int number;
	private double salary;
	// These are all private to allow us to use encapsulation

	public Player(String name, int number, double salary) {
		this.name = name;
		this.number = number;
		this.salary = salary;
	}

	public String getName() {
		String str = "Name = " + this.name;
		return str;
	}

	public int getNumber() {
		return this.number;
	}

	public double getSalary() {
		return this.salary;
	}
}