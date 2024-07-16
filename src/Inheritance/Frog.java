package Inheritance;

public class Frog {

	private String firstName;
	private String lastName;
	private int age;


	public Frog(String nameParameter, int ageParameter){
		firstName = nameParameter;
		age = ageParameter;
	}

	public Frog(int agePar, String lastNamePar, String firstNamePar){
		firstName = firstNamePar;
		age = agePar;
		lastName = lastNamePar;
	}
}
