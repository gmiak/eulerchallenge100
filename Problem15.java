// Author @mr.gmiak.dv
public class Problem15 {
    public static void main(String[] args) {
        int n=20;
        System.out.println("How many such routes are there through a grid with size "+n+"X"+n+" ? The answer is = "+ latticePaths(n));
    }
    public static long latticePaths(int n) {
        int size_grid = n;
        long paths = 1;
        for (int i=0; i<size_grid; i++) {
            paths *= (2*size_grid) - i;
            paths /= i+1;
        }
        return paths;
    }
}
