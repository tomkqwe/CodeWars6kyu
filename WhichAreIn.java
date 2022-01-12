package CodeWars;

import java.util.Arrays;
import java.util.TreeSet;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        TreeSet<String> set = new TreeSet<>();
        for (String a : array1) {
            for (String b : array2) {
                if (b.contains(a)){
                    set.add(a);
                }
            }
        }
        String [] result = new String[set.size()];
        set.toArray(result);
        return result;
    }

    public static void main(String[] args) {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        System.out.println(Arrays.toString(inArray(a, b)));
    }
}
