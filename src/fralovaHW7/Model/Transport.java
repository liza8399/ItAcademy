package fralovaHW7.Model;

import fralovaHW7.Interface.IBeep;
import fralovaHW7.Interface.IDrive;
import fralovaHW7.Interface.IPark;

public abstract class Transport implements IDrive, IPark, IBeep {

	final int speedLimit = 100;
	private String model;
	public double height;
	double weight;
	protected int maxSpeed;

	@Override
	public void drive() {

	}

	@Override
	public void doSmth1() {
		IDrive.super.doSmth1();
	}

	@Override
	public void beep() {

	}

	@Override
	public void doSmth2() {
		IBeep.super.doSmth2();
	}

	@Override
	public void park() {

	}

	@Override
	public void doSmth() {
		IPark.super.doSmth();
	}

	public Transport(String model, double height, double weight, int maxSpeed) {
		this.model = model;
		this.height = height;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
	}

	void whatIsIt(){
		System.out.println("That's a transport");
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public abstract void move();

	final static void moving(){
		System.out.println("Transport is moving");
	}


}
