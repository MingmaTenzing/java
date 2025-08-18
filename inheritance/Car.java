package inheritance;

public class Car extends Vehicle {
    private String model = "Aurion";
    

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.brand);
        System.out.println(myCar.model);
    }
}
