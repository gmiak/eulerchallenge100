import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        int x=1000;
        System.out.println("Product abc such that a+b+c = "+x+" is: "+specialPythagoreanTriplet(x));

    }
    public static int specialPythagoreanTriplet(int n){
        int specialPythaTriplet=0;
        int i=0, j=0, k=0;
        for (i = 1; i<=n; i++) {
            for (j = 1; j<=i; j++) {
                for (k=1; k<=j; k++) {
                    if( (k*k)+(j*j) == (i*i) && (k+j+i==n) ) {
                        System.out.println("("+k+", "+j+", "+i+")");
                        specialPythaTriplet = k*j*i;
                    }
                }
            }
        }
        return specialPythaTriplet;
    }
}
