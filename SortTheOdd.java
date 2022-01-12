package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<array.length;i++) {
            if (array[i]%2 == 1){
                list.add(array[i]);
                array[i] = 666666;
            }
        }
        list.sort(Comparator.comparingInt(o -> o));
        int k =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 666666){
                array[i] = list.get(k);
                k++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{})));
    }
}
