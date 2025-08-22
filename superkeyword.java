
class Animal {
        
    String type = "Cat";
        public void animalSound() {

            System.out.println("the animal makes a sound");
        }
    }

    class Dog extends Animal {
        
        String type = "Dog";
        

        public void dogType() {
            System.out.println(super.type);
        }
        public void animalSound() {
 super.animalSound();
            System.out.println("dog is bow bow");
        }
    }
public class superkeyword {
    
 public static void main(String[] args) {
     

     Dog myDog = new Dog();
     myDog.animalSound();
     myDog.dogType();
    
 }


    
}
