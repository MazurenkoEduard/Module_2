package task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Task1 implements DateFormatI {

    public static final ArrayList<String> ALLOWED_DATE_FORMATS = new ArrayList<>(List.of("yyyy/MM/dd", "dd/MM/yyyy", "MM-dd-yyyy"));
    public static final String RETURNED_DATE_FORMAT = "yyyyMMdd";

    public List<String> datesToStringFormat(List<String> dates) {
        DateTimeFormatter returnFormat = DateTimeFormatter.ofPattern(RETURNED_DATE_FORMAT);
        List<String> newDates = new ArrayList<>();
        for (String date : dates) {
            for (String format : ALLOWED_DATE_FORMATS) {
                try {
                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(format);
                    LocalDate localDate = LocalDate.parse(date, dateFormat);
                    newDates.add(localDate.format(returnFormat));
                    break;
                } catch (DateTimeParseException e) {}
            }
        }
        return newDates;
    }
}
