package CodeWars;

import java.util.Arrays;

public class TheSupermarketQueue {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] array = new int[n];
        for (int i = 0; i < customers.length; i++) {
            array[0]+=customers[i];
            Arrays.sort(array);
        }

        return array[n-1];
    }

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }
}
