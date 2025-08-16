public class encap {
    private String name = "jhon";
    String phone = "0420639689";

    public String get_name() {
        return name;
    }

    public static String static_name() {
        return "James";
    }

    private String setName(String name) {
        this.name = name;
        return this.name;
    }

    public static void main(String[] args) {

        
        encap myObj_name = new encap();
   
        System.out.println(myObj_name.get_name());
        System.out.println(myObj_name.setName("mingma"));
        



    }
}
