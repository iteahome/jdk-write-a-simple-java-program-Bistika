import org.joda.time.DateTime;
import org.joda.time.Duration;
// import joda-time-2.10.2.jar.DateTime;
// import joda-time-2.10.2.jar.Duration;

public class main {

    public static void main(String[] args) {
        DateTime now = DateTime.now();
        for (int i=1; i<=10;i++){
            System.out.println(i);
        }
        DateTime other = DateTime.now();
        Duration duration = new Duration(now, other);
        System.out.println(duration);
        System.out.println("Short difference of time, just to demonstrate.");
    }
}