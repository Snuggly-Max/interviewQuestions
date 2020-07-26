
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class q2 {
    //JAVA 时间格式化处理
    //DateTimeFormatter 是线程安全 SimpleDateFormat 不是线程安全
    public static void main(String [] args){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);
    }
}
