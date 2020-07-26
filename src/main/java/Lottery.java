import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Lottery {
    int [] winNumbers = new int [7];
    String date;
    public Lottery(){
        generateNumbers();
        setDate();
    }
    public void generateNumbers (){
        int count = 7;
        Random rand = new Random();

        while (count > 0){
            winNumbers[count-1] = rand.nextInt(35)+1;
            count--;
        }
    }
    public void setDate(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
        String formatDateTime = now.format(format);
        date = formatDateTime;
    }
    public int check(String [] numbers){
        int count =0;
        for (int winNumber:winNumbers){
            for (String number :numbers){
                if(winNumber == Integer.parseInt(number)){
                    count ++;
                }
            }
        }
        return count;
    }
    public void showWinningNumber (){
        for (int number:winNumbers){
            System.out.print(number+",");
        }
    }
}
