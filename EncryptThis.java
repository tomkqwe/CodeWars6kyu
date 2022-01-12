package CodeWars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EncryptThis {
    public static String encryptThis(String text) {
        // Implement me! :)
        if (text.equals("")) return text;
        StringBuilder sb = new StringBuilder();
        String[] strings = text.split(" ");
        for (int i = 0; i < strings.length; i++) {
            char[]chars = strings[i].toCharArray();
            if (chars.length == 1){
                sb.append((int) chars[0]);
                strings[i] = sb.toString();
                sb.setLength(0);
            }else if (chars.length == 2) {
                for (int j = 0; j < chars.length-1; j++) {
                     sb.append((int) chars[0]);
                     sb.append(chars[chars.length-1]);
                     strings[i] =sb.toString();
                     sb.setLength(0);

                }
            }else {
                sb.append((int) chars[0]);
                char tmp = chars[chars.length-1];
                chars[chars.length-1] = chars[1];
                chars[1] = tmp;
                for (int j = 1; j < chars.length ; j++) {
                    sb.append(chars[j]);
                }
                strings[i] = sb.toString();
                sb.setLength(0);
            }
        }
        return Arrays.stream(strings).map(s -> s+" ").collect(Collectors.joining()).trim();
    }

    public static void main(String[] args) {
        System.out.println(encryptThis("A wise old owl lived in an oak"));
    }
}
