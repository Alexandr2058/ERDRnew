package libs;

import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    private Logger log;

    public Utils(){
        log = Logger.getLogger(getClass());
    }

    public static String getDateAndTime(String format){
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();
        String dateFormated = dateFormat.format(date);
        System.out.println(dateFormated);
        return dateFormated;
    }
}
