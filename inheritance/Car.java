package inheritance;

public class Car extends Vehicle {
     String model = "Aurion";
    

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand);
        System.out.println(myCar.model);
    }
}
