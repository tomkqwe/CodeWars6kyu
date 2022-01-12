package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class Eureka {
    public static List<Long> sumDigPow(long a, long b) {
        // your code
        ArrayList<Long> arrayList = new ArrayList<>();
        for (int i = (int) a; i < b ; i++) {
            int original = i;
            int digits = 0;
            int result = 0;

            while ( original != 0){
                original/=10;
                digits++;
            }
            original = i;
            for (int j = digits; j > 0  ; j--) {
                int remainder = original % 10;
                result += Math.pow(remainder,j);
                original /= 10;
            }
            original = i;
            if (original == result){
                long ls = result;
                arrayList.add(ls);
            }

        }
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(sumDigPow(1,100));
    }
}
