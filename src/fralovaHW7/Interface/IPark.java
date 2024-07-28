package fralovaHW7.Interface;

public interface IPark {

	void park();

	default void doSmth(){
		System.out.println("Do something from Park");
	}
}
