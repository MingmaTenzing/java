abstract class Animal {
    


    public abstract void animalSound();

    public void sleep() {
        System.out.println("sleeping animal");
 
 
    }
}


class Pig extends Animal {
@Override
    public void animalSound() {
System.out.println(" we we");
    }
}


public class test extends Pig {


    public static void main(String[] args) {
        
        test myTest = new test();

        
        myTest.animalSound();

    

    }
}