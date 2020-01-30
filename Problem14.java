// Author @mr.gmiak.dv
public class Problem14 {
    public static void main(String[] args) {
        int limit = 100000;
        System.out.println("Which starting number, under the given limit ("+limit+"),\f" +
                " produces the longest chain? Answer = "+longestCollatzSequence(limit)+".");
    }
    public static int longestCollatzSequence(int n) {
        int number= 0, longest=0, numberOfTerms=0;
        for (int i=n; i>=1; i--) {
            numberOfTerms = maxTerms(i);
            if(number < numberOfTerms) {
                number = numberOfTerms;
                longest = i;
            }
        }
        return longest;
    }
    public static int maxTerms(int n) {
        int number= n, terms=1, max=0, retur=0;
        if (n==0)
            return 0;
        while(retur !=1){
            if (number%2==0){
                number = number/2;
                terms++;
                retur = number;
            }
            else{
                number = number*3+1;
                terms++;
                retur = number;
            }
        }
        return terms;
    }

}
