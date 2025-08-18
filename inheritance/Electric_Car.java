package inheritance;

public class Electric_Car extends Car {

    String battery_size = "450kw";
    public static void main(String[] args) {
        Electric_Car tesla = new Electric_Car();
tesla.honk();
        System.out.println(tesla.battery_size);
        System.out.println(tesla.brand);
        System.out.println(tesla.model);
    }
    


}
