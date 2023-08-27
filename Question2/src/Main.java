import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(new FileReader("input.csv"));
            PrintWriter pw = new PrintWriter("output.csv");

            String line = br.readLine();
            while(line != null){
                String[] arr = line.split(" ");
                int sum = findSum(arr);
                pw.println(line + " " + sum);
                line = br.readLine();
                System.out.println(sum);
            }
            br.close();
            pw.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int findSum(String[] arr){
        int sum = 0;
        for(String s: arr){
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}