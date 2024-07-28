package exceptionHW;

import static exceptionHW.CalculatorDividing.*;

public class MainException {
	public static void main(String[] args) {

		try {
			System.out.println(divide3(5, 0));
		} catch (MyException e){
			System.out.println("You can't divide by zero. Try again.");
		}




	}


}
