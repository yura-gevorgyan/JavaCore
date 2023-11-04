package homeworks.medicalcenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat SDF1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public static String dateToString(Date date){
      return SDF.format(date);
    }

    public static Date stringToDate(String date) throws ParseException {
        return SDF.parse(date);
    }

    public static String dateTimeToString(Date date){
      return SDF1.format(date);
    }

    public static Date stringToDateTime(String date) throws ParseException {
        return SDF1.parse(date);
    }


}
