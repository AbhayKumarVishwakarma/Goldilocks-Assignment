public class Main {

    public static void main(String[] args) {
        if(args.length != 0){
            for (String s: args){
                System.out.println(s);
            }
        }
        else{
            System.out.println("Not find any input!");
        }
    }
}