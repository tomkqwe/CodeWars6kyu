package CodeWars;

import java.util.ArrayList;
import java.util.LinkedList;

public class BreakCamelCase {
    public static String camelCase(String input) {
        LinkedList<Character> list = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (char s: input.toCharArray()){
            list.add(s);
            if (Character.isUpperCase(s)){
                arrayList.add(list.lastIndexOf(s));
            }
        }
        int[] spaces = new int[arrayList.size()];
        for (int i = 0; i < spaces.length; i++) {
            spaces[i] = arrayList.get(i)+i;
            list.add(spaces[i],' ');
        }
        for (Character character : list) {
            builder.append(character);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("bigKnowPlaceNextPlaceSeemFirstThink"));
    }
}
