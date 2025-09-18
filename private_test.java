
class Person {

    private final String name;

    public Person() {

        this.name = "love";
    }
  
    public String setName(String input_name) {
        this.name = input_name;
        return this.name;

    }

    public String getName() {
        return this.name;
    }
 
}

public class private_test {


    public static void main(String[] args) {
        Person newPerson = new Person();
        
        newPerson.setName("zing");
        System.out.println(newPerson.getName());
    }

    
    

}
