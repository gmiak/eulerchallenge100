// Autor @mr.gmiak.dv
public class Problem2 {
    public static void main(String[] args) {
        System.out.println("The sum of the even-valued of n(th)term (n=43) = "+fiboEvenSum(43)+".");
    }
    // Find the sum of the even-valued terms in Fibonacci sequence and do not exceed the n(th) term.
    public static int fiboEvenSum(int n){
        int evenSum=0;
        int n1=1, n2=2, n3=0;
        for (int i=2; i<n; i++){
            n3=n1+n2;
            n1=n2;
            if (n1%2==0)
                evenSum+=n1;
            n2=n3;
        }
        return evenSum;
    }
}
