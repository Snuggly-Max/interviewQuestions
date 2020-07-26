
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class q4 {

    //文本的倒序输出
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String readInput = input.nextLine();
        String output = "";
        for(int a = readInput.length()-1;a>=0;a--){
            output += readInput.charAt(a);
        }
        System.out.println(output);
    }
}
