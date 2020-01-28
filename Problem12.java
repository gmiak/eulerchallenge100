// Author @mr.gmiak.dv
public class Problem12 {
    public static void main(String[] args) {
        int n = 167;
        System.out.println("The value of the first triangle number to have over "+n+" divisors is = "+divisibleTriangleNumber(n)+".");
    }
    public static int divisibleTriangleNumber(int x) {
        int divisor=0, n1=1, n2=2, number=0;
        while (x > divisor) {
            divisor = max_divisors(n1);
            number = n1;
            n1 = n1 + n2;
            n2++;
        }
        return number;
    }
    // return size of all divisors of n
    public static int max_divisors(int x){
        int max=0;
        for (int i=1; i<=x; i++) {
            if(x%i==0)
                max++;
        }
        return max;
    }
}
