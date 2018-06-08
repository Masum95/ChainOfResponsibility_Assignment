import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Vacation {

    private LocalDate fromDate;
    private LocalDate toDate;
    private DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Vacation(String fromDate, String toDate) {
        this.fromDate = LocalDate.parse(fromDate,df);
        this.toDate = LocalDate.parse(toDate,df);
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = LocalDate.parse(fromDate,df);
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = LocalDate.parse(toDate,df);
    }

    public long getLength() {
        Duration dr = Duration.between(fromDate.atStartOfDay(),toDate.atStartOfDay());
        return Math.abs(dr.toDays());
    }


}
