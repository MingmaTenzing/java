import java.util.Scanner;

public class User_Input {
   
    
    Scanner myuserObj_Scanner = new Scanner(System.in);

    String name = myuserObj_Scanner.nextLine();
    int age = myuserObj_Scanner.nextInt();

    public static void main(String[] args) {




        System.out.println("enter user name");

        System.out.println(myuserObj_Scanner.name());
        



    }



}
