// Author @mr.gmiak.dv
public class Problem6 {
    public static void main(String[] args) {
        int x = 100;
        System.out.println("The difference between the sum of the squares of the first "+x+"\f" +
                "natural numbers and the square of the sum is "+sumSquareDifference(x));
    }
    public static int sumSquareDifference(int n){
        int sumSquareDifference=0, square1=0, square2=0;
        for (int i=1; i<=n; i++){
            square1 = square1 + (int)Math.pow(i, 2);
            square2 = square2 + i;
        }
        sumSquareDifference = (int)Math.pow(square2, 2) - square1;
        return sumSquareDifference;
    }
}
