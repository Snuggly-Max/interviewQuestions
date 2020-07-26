import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class q8 {
    //获取 GMT8 时间
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm 'GMT+8'", Locale.CANADA);

        String formatDateTime = now.format(format);
        System.out.println(formatDateTime);
    }
}
