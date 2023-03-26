public class ProgrammingLanguage{

	//Declaring the instance variables

	public String name;
	public double version;

	//Constructor to initialize the instance variables

	public ProgrammingLanguage(String name, double version) {

		this.name = name;
		this.version = version;


	}

	// Overriding toString method to return the String representation of the object

	public String toString() {

		return "(" + this.name + "," + this.version + ")";

	}


}