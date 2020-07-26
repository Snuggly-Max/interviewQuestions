import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class q3 {
    public static void main(String [] args) {
//        将毫秒转化为日期
        Scanner input = new Scanner(System.in);
        Integer readInput = input.nextInt();
        //System.out.println(readInput);
        int sec = readInput / 1000;
        int secLeft = sec % 60;
        int min = (int) (sec / 60);
        int minLeft = min % 60;
        int hour =(int)(min/60);
        int hourLeft = hour%24;
        int day =(int) (hour/24);
        System.out.println(day + " days "+ hourLeft+" hours "+minLeft + " mins "+secLeft+" secs ");
    }
}
