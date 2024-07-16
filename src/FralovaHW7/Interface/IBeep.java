package FralovaHW7.Interface;

public interface IBeep {

	void beep();

	default void doSmth2(){
		System.out.println("Do something from Beep");
	}
}
