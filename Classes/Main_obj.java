public class Main_obj {
   
    int x = 5;
    int y = 3;

     static class Car {
        String name ;
        String brand;
        String trim ;
    }



    static int showvalue(Main_obj obj) {
        return obj.x;
    }
    
    public static void main(String[] args) {

        Main_obj mynewObj = new Main_obj();
        mynewObj.x = 3;
        mynewObj.y = 4;
        System.out.println(mynewObj.x + " " + mynewObj.y);
   
        System.out.println(Main_obj.showvalue(mynewObj));

        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.name = "Aurion";
        myCar.trim = "Touring";

        System.out.println(myCar.brand);
        System.out.println(myCar.name);
        System.out.println(myCar.trim);
        


    }
}
