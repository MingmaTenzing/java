public class car {

    int year;
    String name;
    String trim;

    public car(int model_year, String car_name, String car_trim) {

        year = model_year;
        name = car_name;

        trim = car_trim;

    }


    public static void main(String[] args) {

        car my_first_car = new car(2007, "Toyota Aurion", "Touring");
        System.out.println(my_first_car.name);
        System.out.println(my_first_car.year);
        System.out.println(my_first_car.trim);
    }
    
    
}
