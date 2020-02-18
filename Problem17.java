// Author @mr.gmiak.dv
public class Problem17 {
    public static void main(String[] args) {
        int limit = 1000;
        System.out.println("If all the numbers from 1 to "+limit+" inclusive were written out in words, how many letters would be used? "+numberLetterCounts(limit));
    }


    public static long numberLetterCounts(int n) {
        long count=0;
        for (int i=1; i<=n; i++) {
            count += letterCounts(numberToLetter(i));
        }
        return count;
    }
    public static int letterCounts(String name) {
        return name.length();
    }


    public static String numberToLetter(int n) {
        String[] units = { "","one","two","three","four","five","six","seven","eight","nine","ten", "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

        String[] tens = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

        String[] hundreds = {"","onehundred","twohundred","threehundred","fourhundred","fivehundred","sixhundred", "sevenhundred","eighthundred","ninehundred"};
        String namewithAnd = "";

        if(n == 1000) {
            return "onethousand";
        }

        if(n < 20) {
            return units[n];
        }

        if(n < 100) {
             /*
            n<100
            ex: 90/10 = 9 ==> tens[9] = ninety
                + 90%10 = 0 ==> units[0] = ""
                Answer= ninety
             */
            return tens[n/10] + numberToLetter(n%10);
        }
        /*n>100
        ex: 144 % 100 = 44, answer= onehundredandfortyfour
        */
        namewithAnd = numberToLetter(n % 100);

        if(namewithAnd.length() > 0)
            namewithAnd = "and" + namewithAnd;

        return hundreds[n/100] + namewithAnd;
    }

}

