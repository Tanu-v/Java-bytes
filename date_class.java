
import java.util.Date;

public class date_class {

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getDay());
        System.out.println(d.getSeconds());
    }

}
