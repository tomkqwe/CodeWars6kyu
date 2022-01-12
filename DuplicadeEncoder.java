package CodeWars;

import java.util.*;

public class DuplicadeEncoder {
    static String encode(String word){
        String result ="";
        int count = 0;
    char[] characters = word.toLowerCase().toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (char character : characters) {
            list.add(character);
        }
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i <  characters.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (characters[i] == list.get(j)){
                    count++;
                }

                } if (count > 1) {
                arrayList.add(')');
            }if (count ==1){
               arrayList.add('(');
            }
            count = 0;
        }
        for (Character character : arrayList) {
            result += character;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
    }
}

