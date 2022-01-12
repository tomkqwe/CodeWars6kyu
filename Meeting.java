package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Meeting {
    public static String meeting(String s) {
        // your code
        ArrayList<String> list = new ArrayList<>();
        String result = s.toUpperCase();
        String[] strings    = result.split(";");
        String[][] strings1 = Arrays.stream(strings).map(s1 -> s1.split(":")).toArray(String[][]::new);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strings1.length; i++) {
            for (int j = 0; j < strings1[i].length-1; j++) {
                String tmp = strings1[i][j];
                strings1[i][j] = strings1[i][j+1];
                strings1[i][j+1] = tmp;
            }
            strings[i] = strings1[i][0]+", "+strings1[i][1];
        }
        Collections.addAll(list, strings);
        Collections.sort(list);
        for (String s1 : list) {
            builder.append("("+s1+")");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(meeting("Andrew:Gates;Haley:Stan;Elizabeth:Arno;Jacob:Gates;Lewis:Dorries;Ann:Wahl;Amber:Cornwell;Ann:Bell;Victoria:Dorny;Paul:Cornwell;Anna:Rudd;Ann:Kern;Ann:Wahl;Grace:Thorensen;Madison:Stan;Ann:Stan;Emily:Arno;Elizabeth:Bell;John:Wahl;Alex:Wah"));
    }
}
