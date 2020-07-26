import java.util.Scanner;

public class q5 {
    //判断一个数字是奇数还是偶数
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Integer readInput = input.nextInt();
        if(readInput%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
