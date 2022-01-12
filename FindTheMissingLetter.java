package CodeWars;

import java.util.ArrayList;

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array)
    {
        char[] destinationArraytoLowerCase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        ArrayList<Character> listToLowerCase = new ArrayList<>();
        char[] destinationArraytoUpperCase = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        ArrayList<Character> listToUpperCase = new ArrayList<>();
        for (char c : destinationArraytoLowerCase) {
            listToLowerCase.add(c);
        }
        for (char c : destinationArraytoUpperCase) {
            listToUpperCase.add(c);
        }
        if (Character.isUpperCase(array[0])){
            int k =0;
            for (int i = listToUpperCase.indexOf(array[0]); i < listToUpperCase.size(); i++) {
                if (listToUpperCase.get(i) != array[k]){
                    return listToUpperCase.get(i);
                }
                k++;
            }
        }else {
            int k =0;
            for (int i = listToLowerCase.indexOf(array[0]); i < listToLowerCase.size(); i++) {
                if (listToLowerCase.get(i) != array[k]){
                    return listToLowerCase.get(i);
                }
                k++;
            }
        }






        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
