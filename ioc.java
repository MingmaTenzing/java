class MyCar {

    public void drive() {
        System.out.println("driving");
    }
}


class Driver {

    private final MyCar car;

    public Driver(MyCar car) {

        this.car = car;

    }
}

public class ioc {

    public static void main(String[] args) {
        
        MyCar newcar = new MyCar();

        newcar.drive();

        

    


    }
}
