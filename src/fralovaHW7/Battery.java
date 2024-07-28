package fralovaHW7;

public class Battery {

	private int capacity;
	protected int power;

	public Battery(int capacity, int power) {
		this.capacity = capacity;
		this.power = power;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
}
