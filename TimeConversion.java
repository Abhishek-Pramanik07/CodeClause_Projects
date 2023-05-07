// Time Conversion by Country

package Questions.Projects;

import java.text.SimpleDateFormat;
import java.util.*;

class TimeConversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String format="dd-MM-yyyy hh:mm:ss a";
        SimpleDateFormat dateFormat=new SimpleDateFormat(format);
        Date dt = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(dt);

        System.out.println("Current Timezone:-");
        System.out.println("Date: "+dateFormat.format(cal.getTime()));
        System.out.println("Timezone: "+cal.getTimeZone().getID());
        System.out.println("Timezone Name: "+cal.getTimeZone().getDisplayName());

        System.out.println();
        System.out.print("Enter a country to convert time for: ");
        String country = sc.nextLine();

        TimeZone TZ= TimeZone.getTimeZone(country);
        SimpleDateFormat TZFormat = new SimpleDateFormat(format);
        TZFormat.setTimeZone(TZ);
        cal.setTimeZone(TZ);

        System.out.println();
        System.out.println("After conversion, Timezone:-");
        System.out.println("Date: "+TZFormat.format(cal.getTime()));
        System.out.println("Timezone: "+cal.getTimeZone().getID());
        System.out.println("Timezone Name: "+cal.getTimeZone().getDisplayName());
    }
}