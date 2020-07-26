import java.util.Scanner;

//public class q1 {
//    public static void main(String [] args){
//        System.out.println("hello");
//        Scanner input = new Scanner(System.in);
//        String readInput = input.nextLine();
//        System.out.println(readInput);
//    }
//
//}

public class q1 {
    public static void main(String [] args){
//        JAVA 时间格式化处理
        Scanner input = new Scanner(System.in);
        String readInput = input.nextLine();
        //System.out.println(readInput);
        String output = "";
        for(int a=0;a<readInput.length();a++){
            char letter = readInput.charAt(a);
            output += Integer.toHexString(letter);
        }
        System.out.printf("%s",output);
    }




}