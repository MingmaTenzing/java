public class java_method {

    public static String callme() {
        String template = "Did you call me";
        return template;
    }
    
    public static void display_name_and_age(String name, int age) {
        System.out.println("Your name is " + " " + name + " " + "and your age is " + age);
    }

    public static void call_your_name(String provided_name) {

        System.out.println(callme() + provided_name);
    
    
    
    }


    public static void main(String[] args) {
        callme();
        callme();
        callme();

   display_name_and_age("Elon Musk", 50);
   
    }

}



