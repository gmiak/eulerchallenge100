public class Problem10 {
    public static void main(String[] args) {
        int x = 140759;
       System.out.println("The sum of the primes below "+x+" = "+primeSummation(x)+".");
    }
    public static int primeSummation(int n){
        int primSum=0;
        for (int i=2; i<n; i++){
            if (isPrime(i)==1)
                primSum = primSum+i;
        }
        return primSum;
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
