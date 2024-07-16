package Inheritance;

public interface IMove {

	void move();

	default void saySmth(){
		System.out.println("Move2");
	}

}
