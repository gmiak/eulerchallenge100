// Author @mr.gmiak.dv
public class Problem7 {
    public static void main(String[] args) {
        int n = 10001;
        System.out.println("What is the "+n+"th prime number? "+ nthPrime(n)+".");
    }
    public static int nthPrime(int n) {
        int nthPrime=0, position=0, start=1;
        while (n>position){
            start++;
            if (isPrime(start)==1) {
                position++;
            }
        }
        nthPrime = start;
        return nthPrime;
    }
    // Checking the  primality of a given  integer x by Trial division.
    // Trial division : This method divides x by each integer from 2 up to the square root of x.
    public static long isPrime(long x){
        int flag=1;
        long m=(long)Math.sqrt(x);
        for (int i=2; i<=m; i++) {
            if (x%i==0){
                flag=0;
                break;
            }
        }
        return flag;
    }
}
