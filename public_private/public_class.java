package public_private;

public class public_class {
    public String provide_admin() {


        String name = "mingma";
        return name;
    }
    

    private String privateUser() {

        String username = "userprivate";
        return username;
    }
    public static void main(String[] args) {
        public_class myClass = new public_class();
        System.out.println(myClass.provide_admin());
        System.out.println(myClass.privateUser());
    }
}
