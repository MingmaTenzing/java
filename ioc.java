class MyCar {

    public void drive() {
        System.out.println("driving");
    }
}


class Driver {

    private final MyCar car;
    String driverName;

    public Driver(MyCar inputcar) {

        this.car = inputcar;
        this.driverName = "Mingma";

    }

    public void starttrip() {

        car.drive();


    }
}

public class ioc {

    public static void main(String[] args) {
        
        MyCar newcar = new MyCar();

        newcar.drive();

        Driver myDriver = new Driver(newcar);
        myDriver.starttrip();
        System.out.println(myDriver.driverName);
        
        myDriver.driverName = "zing";
        System.out.println(myDriver.driverName);



    
        

    


    }
}
