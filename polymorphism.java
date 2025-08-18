class Animal {
    public void animalSound() {
    
        System.out.println("the animal made a sound...");
 }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("this is pig sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("this is dog sound");
    }
}



public class polymorphism {
    public static void main(String[] args) {
        

        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal mydog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        mydog.animalSound();
    }
}
