package FralovaHW7;


import FralovaHW7.Model.Car;

public class MainTransport {
	public static void main(String[] args) {

		Engine engine = new Engine(250);
		Radiator radiator = new Radiator();
		Battery battery = new Battery(50, 650);
		Car car = new Car("BMW",1.7,500,300,5,engine,radiator,battery);

		Engine engine1 = new Engine(300);
		Radiator radiator1 = new Radiator();
		Battery battery1 = new Battery(60, 450);
		Car car1 = new Car("Ford",1.4,400,240,5,engine1,radiator1,battery1);

		System.out.println(car.hashCode());
		System.out.println(car1.hashCode());

		System.out.println(car.toString());
		System.out.println(car1.toString());

		System.out.println(car.equals(car1));

	}

}
