package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String d1 = in.readLine();
        String d2 = in.readLine();
        SimpleDateFormat f = new SimpleDateFormat("yyyy:MM:dd");

        try {
            Date date1 = f.parse(d1);
            Date date2 = f.parse(d2);
            long diff = date2.getTime() - date1.getTime();
            out.printLine(Math.abs(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
