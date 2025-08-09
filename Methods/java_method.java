public class java_method {

    public static String callme() {
        String template = "Did you call me";
        return template; 
    }

    public static void call_your_name(String provided_name) {

        System.out.println(callme() + provided_name);
    
    
    
    }


    public static void main(String[] args) {
        callme();
        callme();
        callme();

        call_your_name("mingma");
    }

}



