<<<<<<< HEAD
// inteface is another way of doing abstraction

//
=======
//interface revised


//interface is another way of having abstraction in java

interface Animal {
//its an abstract class that groups the related method with empty bodies
    public void animalSound();

    public void sleep();

    

}

class Dog implements Animal {


    @Override
    public void animalSound() {
        System.out.println("dog is saying bhow bhow");
    }
 @Override
    public void sleep() {
        System.out.println("sleeping dog ");
    }

}


public class Interface_JAVA {
    

    public static void main(String[] args) {
        Dog hercules = new Dog();

        hercules.animalSound();
        hercules.sleep();
       
    }
}
>>>>>>> 3906cea08693ba348e19bb2b3d7596a45977fa22
