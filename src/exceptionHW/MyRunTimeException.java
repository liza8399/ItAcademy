package exceptionHW;

public class MyRunTimeException extends RuntimeException {

	public MyRunTimeException (String message){
		System.out.println("You can't divide by zero");
	}


}
