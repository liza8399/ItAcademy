public class FralovaStringHW {
	public static void main (String[] args){
		String a = "Hello everyone! My name is Liza.";
		String b = "hello everyone! My name is Liza.";
		System.out.println("Длина строки: " + a.length());
		System.out.println("10 буква в строке: " + a.charAt(9));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.indexOf("is"));
		System.out.println(a.startsWith("Hello"));
		System.out.println(a.startsWith("liza"));
		System.out.println(a.replace("everyone","IT-Academy"));
		System.out.println(a.substring(6,15));
		String c = String.join(" ", "I", "am", " learning", " Korean", " language", " and", " programming");
		System.out.println(c);
		String [] d =a.split(" ");
		StringBuilder strBuilder = new StringBuilder(a);
		System.out.println(strBuilder.append(" Nice to meet you!"));
		System.out.println(strBuilder.insert(16, "This is my homework. "));
		System.out.println(strBuilder.delete(5,14) );
		System.out.println(strBuilder.deleteCharAt(42) );
		System.out.println(strBuilder.reverse());



	}

	static final public class PrintInfo {

		public static void printInfo(){
			System.out.println("Метод не принимает параметры");
		}

		public static void printInfo(int a){
			System.out.println("Метод принимает int");
		}

		public static void printInfo(String a){
			System.out.println("Метод принимает String");
		}
	}
}
