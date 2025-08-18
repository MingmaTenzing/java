package inheritance;

public class honkycar extends Vehicle {
   
    public void honk() {

        System.out.println("honk from honky car");

    }
    public static void main(String[] args) {
        honkycar mycar = new honkycar();
        mycar.honk();
    }
    
}
