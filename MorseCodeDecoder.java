package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        HashMap<String, String> map = new HashMap<>();
        map.put("a", ".-");
        map.put("b", "-...");
        map.put("c", "-.-.");
        map.put("d", "-..");
        map.put("e", ".");
        map.put("f", "..-.");
        map.put("g", "--.");
        map.put("h", "....");
        map.put("i", "..");
        map.put("j", ".---");
        map.put("k", "-.-");
        map.put("l", ".-..");
        map.put("m", "--");
        map.put("n", "-.");
        map.put("o", "---");
        map.put("p", ".--.");
        map.put("q", "--.-");
        map.put("r", ".-.");
        map.put("s", "...");
        map.put("t", "-");
        map.put("u", "..-");
        map.put("v", "...-");
        map.put("w", ".--");
        map.put("x", "-..-");
        map.put("y", "-.--");
        map.put("z", "--..");
        map.put("1", ".––––");
        map.put("2", "..–––");
        map.put("3", "...––");
        map.put("4", "....–");
        map.put("5", ".....");
        map.put("6", "-....");
        map.put("7", "--...");
        map.put("8", "---..");
        map.put("9", "----.");
        map.put("0", "-––––");
        map.put(".", ".-.-.-");
        map.put(",", "--..--");
        map.put(":", "---...");
        map.put("-", "-....-");
        map.put("/", "-..-.");
        map.put("?", "..--..");
        map.put("!", "-.-.--");
        map.put("SOS", "...---...");


        String[] strings = morseCode.split("   ");
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            String[] strings1 = strings[i].split(" ");
            for (int j = 0; j < strings1.length; j++) {
                for (Map.Entry<String,String> entry: map.entrySet()){
                    if (entry.getValue().equals(strings1[j])){
                        result += entry.getKey();

                    }
                }
            }
            strings[i] = result+" ";
            result = "";
        }
        String over = "";
        for (String a:strings){
            over += a;
        }
        return over.toUpperCase().trim();
    }
    public static void main(String[] args) {
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
    }
}
