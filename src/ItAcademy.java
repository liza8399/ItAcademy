public class ItAcademy {
	public static void main (String[] args){
		printInfo1(1, 2, "hello");
		plus(1, 2);
		plus (2,2);

	}

	public static void printInfo1(int a, int b, String c){ // void ничего не возвращает
		System.out.println(c);
		int d = a + b;
	}
	public static int plus(int a, int b){ // должен возвращать c - сумма чисел a и b
		int c = a + b;
		return c;
	}
}
