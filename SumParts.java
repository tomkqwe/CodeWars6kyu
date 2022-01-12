package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumParts {
    public static int[] sumParts(int[] ls) {
        // your code
        int[] result = new int[ls.length+1];
        for (int l : ls) {
            result[0] +=l;
        }
        for (int i = 1; i < ls.length; i++) {
            result[i] = result[i-1] - ls[i-1];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumParts(new int[]{1, 2, 3, 4, 5, 6})));
    }
}
