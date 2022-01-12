package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class RuleOfDivisibilityBy13 {
    public static long thirt(long n) {
        // your code
        List<Long> divisibilby13 = new ArrayList<>();
        StringBuilder builder = new StringBuilder(n+"");
        List<Long> destination = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < builder.length(); i++) {
            divisibilby13.add((long) (Math.pow(10,i)%13));
        }
        while (count<3){
            while (n !=0){
                destination.add(n%10);
                n/=10;
            }
            for (int i = 0; i < destination.size(); i++) {
                n += destination.get(i)*divisibilby13.get(i);
            }
            destination.removeAll(destination);
            count++;
        }
    return n;
    }

    public static void main(String[] args) {
        System.out.println(thirt(987654321L));
    }
}
