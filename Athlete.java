/***************************** Inheritance and Interfaces ***********************
Program by: Austin Smith
Purpose:
	This program is a quick and easy demonstration of how inheritance and interfaces
	work in Java. This interface is the class that every inherited class must "promise"
	to implement.
Results:
	Creates an interface for our heirarchy of classes to implement. We know all athletes
	have a name, a number, and a salary, so we want to make sure that all the inherited 
	classes and subclasses have at least these methods. A perfect way for this to happen 
	is to create an interface.
********************************************************************************/

public interface Athlete {

	public String getName();

	public int getNumber();

	public double getSalary();
	
}