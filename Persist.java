package CodeWars;

import java.util.ArrayList;

public class Persist {
    public static int persistence(long n) {
        // your code
        int count = 0;
        int length = String.valueOf(n).length();
        ArrayList<Long> arrayList = new ArrayList<>();
        if (length ==1 ) return 0;
            while (n>=10){
                for (int i = 0; i < length; i++) {
                    arrayList.add(i ,n%10);
                    n /=10;
                }
                n = arrayList.stream().reduce((aLong, aLong2) -> aLong *=aLong2).get();
                count++;
                length = String.valueOf(n).length();
                arrayList.removeAll(arrayList);

            }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(persistence(23344));
    }
}
