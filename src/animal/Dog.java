package animal;

class Dog {

	private String name;
	private int age;
	double weight;

	public void setName(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public double getWeight(){
		return weight;
	}

	public void bark(double weight) {
		if (weight <= 4) {
			System.out.println("Tyaf-tyaf!");
		} else if (weight > 4 && weight <= 15) {
			System.out.println("Gaw-gaw!");
		} else if (weight > 15) {
			System.out.println("Woof-woof!");
		}
	}

	void wiggle(){
		System.out.println("*tail wagging*");
	}

}
