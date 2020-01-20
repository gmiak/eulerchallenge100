// Autor @mr.gmiak.dv
public class Problem5 {
    public static void main(String[] args) {
        int x = 20;
        System.out.println("The smallest number that can be divided by each of the numbers from 1 to "+x+"\f" +
                " without any remainder is: "+smallestMult(x));
    }
    public static int smallestMult(int n){
        int smallestMult = 1, two=2, three=3;
        for (int i=1; i<n+1; i++) {
            if (isPrime(i)==1)
                smallestMult = smallestMult*i;
            else if (smallestMult%i==0)
                smallestMult = smallestMult*1;
            else {
                  if (i%two==0)
                    smallestMult = smallestMult*2;
                  else if (i%three==0)
                    smallestMult = smallestMult*3;
            }
        }
        return smallestMult;
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
