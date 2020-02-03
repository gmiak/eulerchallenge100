import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println("What is the sum of the digits of the number 2^"+n+"? Answer = "+powerDigitSum(n)+".");
    }
    public static int powerDigitSum(int n) {
        int sum = 0;
        BigInteger base = new BigInteger(String.valueOf(2));
        // 2^n
        BigInteger result = base.pow(n);
        String sum_str = String.valueOf(result);
        for (int i=0; i<sum_str.length(); i++) {
            char c = sum_str.charAt(i);
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
