package FralovaHW7.Model;

import FralovaHW7.Battery;
import FralovaHW7.Engine;
import FralovaHW7.Radiator;
import FralovaHW7.Transport;

import java.util.Objects;

final public class Bus extends Transport {

	@Override
	public void move() {

	}

	static int count = 0;

	public Bus(String model, double height, double weight, int maxSpeed, Engine engine, Radiator radiator, Battery battery) {
		super(model, height, weight, maxSpeed);
		this.engine = engine;
		this.radiator = radiator;
		this.battery = battery;
	}

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

	@Override
	public String toString() {
		return "Bus{" +
				"engine=" + engine +
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
		Bus bus = (Bus) o;
		return Objects.equals(getEngine(), bus.getEngine()) &&
				Objects.equals(getRadiator(), bus.getRadiator())
				&& Objects.equals(getBattery(), bus.getBattery())
				&& Objects.equals(getModel(), bus.getModel()) && Objects.equals(height, bus.height)
				&& Objects.equals(weight, bus.weight) && Objects.equals(maxSpeed, bus.maxSpeed);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getEngine(), getRadiator(), getBattery(),getModel(), height, weight, maxSpeed);
	}
}
