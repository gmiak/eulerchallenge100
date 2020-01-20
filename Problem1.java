// Autor @mr.gmiak.dv
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is: "+sum(1000));
    }

    // Find the sum of all the multiples of 3 or 5 below n
    public static int sum(int a) {
        int theSum=0;
        for (int i=3; i<a; i++){
            if((i%3==0) || (i%5==0)) {
                theSum = theSum+i;
            }
        }
        return theSum;
    }
}
