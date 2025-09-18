
import java.time.LocalDate;
import java.util.Date;

class DateandTime {


    public static void main(String[] args) {
        
        Date newDate = new Date();
        LocalDate myobj = LocalDate.now();

        System.out.println(myobj);

        System.out.println(newDate.getTime());
    }
}