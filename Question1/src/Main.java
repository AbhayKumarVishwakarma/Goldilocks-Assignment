import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static String convertIntoBinary(String str){
        try{
            int num = Integer.parseInt(str);
            return Integer.toBinaryString(num);
        }catch (NumberFormatException ex){
            return "Invalid input!";
        }
    }

    public static void main(String[] args) {
        String ans1 = convertIntoBinary("123");
        String ans2 = convertIntoBinary("ere");
        System.out.println(ans1);  // 1111011
        System.out.println(ans2);  // Invalid input!
    }
}