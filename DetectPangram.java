package CodeWars;

import java.util.TreeSet;

public class DetectPangram {
    public boolean check(String sentence){
        //code
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
       char[] charsFromParam = sentence.toLowerCase().toCharArray();
        TreeSet<Character> set = new TreeSet<>();
        for (char c : charsFromParam) {
            if (c>=97&&c<=122) {
                set.add(c);
            }
        }
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
       for (char a:chars){
           builder1.append(a);
       }
       for (char a: set){
           builder2.append(a);
       }
        return builder1.toString().equals(builder2.toString());
    }

    public static void main(String[] args) {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        DetectPangram pc = new DetectPangram();
        System.out.println(pc.check(pangram1));
    }

}
