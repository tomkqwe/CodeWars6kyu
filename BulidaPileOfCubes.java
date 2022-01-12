package CodeWars;

public class BulidaPileOfCubes {
    public static long findNb(long m) {
        // your code
        int n = 1;
        while (m>0){
            m -= (long) Math.pow(n,3);
            n++;
        }
        if (m==0)
            return n-1;
        else return -1;
    }
    public static void main(String[] args) {
        System.out.println(findNb(91716553919377L));
    }
}
