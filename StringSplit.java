package CodeWars;

import java.util.*;

public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
        List<Character> characters = new ArrayList<>();
        String[] strings;
        for (char a : s.toCharArray()) {
            characters.add(a);
        }
        if (characters.size()%2==1){
            characters.add('_');
        }
            strings = new String[characters.size()/2];
        int j = 0;
            for (int i = 0; i < strings.length; i++) {
                    strings[i] = characters.get(j)+""+characters.get(j+1);
                    j+=2;

            }
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("HelloWorld")));
        System.out.println(Arrays.toString(solution("LovePizza")));
    }
}
