package fralovaHW7.Model;

import fralovaHW7.Battery;
import fralovaHW7.Engine;
import fralovaHW7.Radiator;

import java.util.Objects;

final public class Car extends Transport {

	@Override
	public void move() {
	}

	int pass;
	static int count = 0;
	private Engine engine;
	private Radiator radiator;
	private Battery battery;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Radiator getRadiator() {
		return radiator;
	}

	public void setRadiator(Radiator radiator) {
		this.radiator = radiator;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Car(String model, double height, double weight, int maxSpeed, int pass, Engine engine, Radiator radiator, Battery battery) {
		super(model, height, weight, maxSpeed);
		this.pass = pass;
		this.engine = engine;
		this.radiator = radiator;
		this.battery = battery;
	}


	@Override
	public String toString() {
		return "Car{" +
				"pass=" + pass +
				", engine=" + engine +
				", radiator=" + radiator +
				", battery=" + battery +
				", height=" + height +
				", weight=" + weight +
				", maxSpeed=" + maxSpeed +
				"} " + super.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return pass == car.pass && Objects.equals(getEngine(), car.getEngine())
				&& Objects.equals(getRadiator(), car.getRadiator()) && Objects.equals(getBattery(), car.getBattery())
				&& Objects.equals(getModel(), car.getModel()) && Objects.equals(height, car.height)
				&& Objects.equals(weight, car.weight) && Objects.equals(maxSpeed, car.maxSpeed);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pass, getEngine(), getRadiator(), getBattery(), getModel(), height, weight, maxSpeed);
	}


}
