// Author @mr.gmiak.dv
public class Problem4 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("The largest palindrome made from the product of two "+n+"-digit numbers is = "+ largestPalindrome(n));
    }
    public static int largestPalindrome(int n) {
        int largestPalindrome = 0, product=0, low = (int)Math.pow(10, n-1),  high = (int)Math.pow(10, n);
        for (int i=low; i<high; i++){
            for (int j=low+1; j<high; j++){
                product = i*j;
                if (isPalindrome(product)==1) {
                    if (largestPalindrome < product)
                        largestPalindrome = product;
                }
            }
        }
        return largestPalindrome;
    }
    public static int isPalindrome(int n){
        int flag=0, tmp=n, sum=0, rest=0;
        while (n>0){
            rest = n%10;
            sum = (sum*10)+rest;
            n = n/10;
        }
        if (tmp == sum) flag=1;
        return flag;
    }
}
