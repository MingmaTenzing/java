public class method_overloading {

    
    static int addtwonums(int x , int y) {          
        return x + y;

    }

    public static double addtwonums(double x, double y) {
        return x + y;

    }

    public static void main(String[] args) {
        int intsum = addtwonums(4, 8);
        double doubleSum = addtwonums(4.3, 1.1);

        System.out.println(intsum);
        System.out.println(doubleSum);
    }
    
}
