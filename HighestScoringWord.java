package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HighestScoringWord {
    public static String high(String s) {
        // Your code here...
        HashMap<Character,Integer> map = new HashMap<>();
        char a = 'a';
        for (int i = 1; i < 27 ; i++) {
            map.put(a,i);
            a++;
        }
        String [] strings = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (String str : strings){
            for (char c: str.toCharArray()){
                sum += map.get(c);

            }
            list.add(sum);
            sum = 0;
        }
        int result = Collections.max(list);

        return strings[list.indexOf(result)];
    }

    public static void main(String[] args) {
        System.out.println(high("b aa"));
    }
}
