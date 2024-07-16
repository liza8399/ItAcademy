package Animal;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Jessi");
        String dogName = dog.getName();
        dog.weight = 20;
        double dogWeight = dog.getWeight();
        dog.setAge(5);
        int dogAge = dog.getAge();
        changedName(dogAge, dogName);

        introducing();
        System.out.println("That's our " + changedName(dogAge, dogName));
        dog.bark(dogWeight);
        dog.wiggle();
    }

    public static void introducing(){
        System.out.println("Let me introduce you to my dog");
    }

    public static String changedName(int dogAge, String dogName){
        if (dogAge < 1){
			return "Little " + dogName;
        } else if (dogAge > 1 & dogAge <10){
            return dogName;
        } else if (dogAge > 10){
			return "Old " + dogName;
        }
        return dogName;

    }

}
