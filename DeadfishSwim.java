package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeadfishSwim {
    public static int[] parse(String data) {
        // Implement me! :)
        int result = 0;
        List<Integer> list = new ArrayList<>();
        char[] chars = data.toCharArray();
        for (char a : chars) {
            switch (a) {
                case 'i':
                    result++;
                    break;
                case 'd':
                    result--;
                    break;
                case 's':
                    result *= result;
                    break;
                case 'o':
                    list.add(result);
                    break;
            }
        }
      int[] integers = new int[list.size()];
        for (int i = 0; i<integers.length;i++) {
            integers[i] = list.get(i);
        }
        return integers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdoso")));
    }
}
