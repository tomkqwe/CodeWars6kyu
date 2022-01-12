package CodeWars;

import java.util.*;

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        // your code
        if (strarr.length == 0|| k> strarr.length|| k<=0) return "";
        boolean stop = false;
        StringBuilder bulder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strarr.length; i++) {
            for (int j = 0; j < k; j++) {
                if (i+j >= strarr.length){
                    stop = true;
                    break;
                }
                bulder.append(strarr[i+j]);
            }
            list.add(bulder.toString());
            bulder.delete(0,bulder.length());
            if (stop) break;
        }
        return Collections.max(list,(o1, o2) -> o1.length()-o2.length());
    }

    public static void main(String[] args) {
        System.out.println(longestConsec((new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}), 2));
//
        System.out.println(longestConsec((new String[]{"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}), 3));

//        System.out.println(longestConsec((new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}), 1));

    }
}
