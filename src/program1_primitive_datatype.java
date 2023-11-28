import java.time.LocalDate;
import java.time.LocalTime;

public class program1_primitive_datatype {
    public static void main(String[] args) {
        String name=new String("varun");
        System.out.println(name.toLowerCase());
        LocalDate now=LocalDate.now();
        System.out.println(now.getDayOfMonth());
        LocalTime now1 = LocalTime.now();
        System.out.println(now1.getHour());
        System.out.println(now1.getMinute());
        System.out.println(now1.getSecond());


    }
}
