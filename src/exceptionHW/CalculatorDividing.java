package exceptionHW;

public class CalculatorDividing {

	static double divideWithRunTimeException (int a, int b) {
		if (b == 0){
			throw new MyRunTimeException(b + " is zero");
		}
		return a/b;
	}

	static double divideWithException ( int a, int b) throws MyException {
		if (b == 0) {
			throw new MyException(b + " is zero");
		}
		return a/b;
	}
}
