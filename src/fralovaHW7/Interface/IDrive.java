package fralovaHW7.Interface;

public interface IDrive {

	void drive();

	default void doSmth1(){
		System.out.println("Do something from Drive");
	}
}
