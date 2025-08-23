abstract class Animal {
    public abstract void animalSound();

    public void sleep() {

        System.out.println("animal is sleeping");
    }

}

 class Pig extends Animal {

    public void animalSound() {

        System.out.println("The pgi is we we");
    }
}
public   class Abstract_Java {




        public static void main(String[] args) {
            Pig myPig = new Pig();
            myPig.animalSound();
            myPig.sleep();
        }
        
  
}
