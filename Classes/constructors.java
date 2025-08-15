public class constructors {

    int x;

    public constructors() {

        x = 5;

        System.out.println(x);

    }
    
 static  int show_int() {
       return 40;
    }
    public static void main(String[] args) {
        constructors myint = new constructors();
        System.out.println(show_int());

     
    }
    

    
}
