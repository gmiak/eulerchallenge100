// Autor @mr.gmiak.dv
public class Problem3 {
    public static void main(String[] args) {
        long n = 6008514751L;
        System.out.println("Largest prime factor of the number "+n+" is: "+ largestPrimeFactor(n));
    }
    public static long largestPrimeFactor(long n){
        long largestPrimeFactor=0;
        long allFactorOfN = n/2;
        if (isPrime(n)==1){
            largestPrimeFactor = n;
        } else {
            for (long i=allFactorOfN; i>=2; i--) {
                if ((n%i==0)&&(isPrime(i)==1)){
                    largestPrimeFactor = i;
                    break;
                }
            }
        }
        return largestPrimeFactor;
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
