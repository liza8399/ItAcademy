package Inheritance;

import java.util.Objects;

public class Car {

	private String model;
	private Engine engine;

	public Car(Engine engine, String model) {
		this.engine = engine;
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car{" +
				"engine=" + engine +
				", model='" + model + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, engine);
	}
}
