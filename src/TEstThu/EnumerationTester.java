package TEstThu;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {
    public static void main(String[] args) {
        Enumeration days;
        Vector  dayname= new Vector();
        dayname.add("sunday");
        dayname.add("Monday");
        dayname.add("Tuesday");
        dayname.add("Wednesday");
        dayname.add("Thursday");
        dayname.add("Priday");
        dayname.add("Saturday");
        days=dayname.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
