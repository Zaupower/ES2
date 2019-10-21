package gradleProjecto;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marcelo
 */
public class WorldTime {

    public void getTimeByCountry(String tzone) {
        DateTime dt = new DateTime();
        DateTime dt2 = dt.withZone(DateTimeZone.forID(tzone));

        int hour = dt2.getHourOfDay();
        int min = dt2.getMinuteOfHour();

        System.out.println(hour + ":" + min);
    }
}
