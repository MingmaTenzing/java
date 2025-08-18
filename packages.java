import java.util.Scanner;
import mypackage.mypackage;
public class packages {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter your name");
        

        mypackage newObj = new mypackage();
        newObj.greet();
        String provided_name = myObj.nextLine();
        System.out.println("user name is " + provided_name);
    }
    
}
