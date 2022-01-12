package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class MexicanWave {
    public static String[] wave(String str) {
        // Your code here
        String[] strings = new String[str.length()];
        char[] chars = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==' ') continue;
            chars[i] = Character.toUpperCase(chars[i]);
            for (int j = 0; j < str.length(); j++) {
                builder.append(chars[j]);
            }
            strings[i] = builder.toString();
            chars[i] = Character.toLowerCase(chars[i]);
            builder.delete(0,builder.length());
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : strings) {
            if (s != null){
                arrayList.add(s);
            }
        }
        return arrayList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("Two words")));
    }
}
