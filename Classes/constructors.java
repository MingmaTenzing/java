public class constructors {

    int x;

    public constructors() {

        x = 5;

        System.out.println(x);

    }
    
 private  int show_int() {
       return 40;
    }
    public static void main(String[] args) {
        constructors myint = new constructors();
        System.out.println(myint.show_int());

     
    }
    

    
}
