// Author @mr.gmiak.dv
import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        System.out.println("The first ten digits of the sum of the following one-hundred 50-digit numbers =\f" +
                " "+ largeSum()+".");
    }
    public static String largeSum(){
        String firsTenDigits="";
        int a=0;
        try {
            // Read file.
            File file = new File("src/Problem13.data");
            Scanner in = new Scanner(file);
            BigInteger sum = BigInteger.ZERO;
            while (in.hasNextLine() &&  a<100){
                BigInteger fyftyDigit = new BigInteger(in.nextLine());
                sum = sum.add(fyftyDigit);
                a++;
            }
            firsTenDigits = sum.toString().substring(0, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return firsTenDigits;
    }
}

