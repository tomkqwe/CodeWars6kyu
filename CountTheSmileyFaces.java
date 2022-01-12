package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {
    public static int countSmileys(List<String> arr) {
        // Just Smile :)

        return (int) arr.stream().filter(s -> s.matches("[:;][-~]?[\\)D]")).count();
    }

    public static void main(String[] args) {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        System.out.println(countSmileys(a));

    }
}
