import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        //35 选 7 彩票程序
        System.out.println("请输入购买号吗，用逗号隔开");
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        String number[] = numbers.split(",");
        Lottery lottery = new Lottery();
        int count = lottery.check(number);
        int winnumbers [] = lottery.winNumbers;
        System.out.println("中奖号吗为");
        lottery.showWinningNumber();
        System.out.println();
        System.out.println("你猜对来 "+count +" 个 "+" 时间："+lottery.date);
    }

}
