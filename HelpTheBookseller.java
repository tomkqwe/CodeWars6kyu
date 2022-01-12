package CodeWars;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelpTheBookseller {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        // your code here
        if ((lstOfArt.length < 0 || lstOfArt == null) || (lstOf1stLetter.length < 0 || lstOf1stLetter == null))
            return "";
        int sum = 0;
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : lstOf1stLetter) {
            String st = Arrays.stream(lstOfArt).filter(s1 -> s1.substring(0, 1).equals(s))
                    .map(s1 -> Arrays.stream(s1.split("\\D")).map(s2 -> s2 + " ").collect(Collectors.joining()))
                    .collect(Collectors.joining());
            Integer a = Arrays.stream(st.trim().split("\\s")).filter(s1 -> s1.length() > 1).mapToInt(Integer::parseInt).sum();
            map.put(s, a);
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

                String result = String.format("(%s : %d) - ", entry.getKey(), entry.getValue());
                builder.append(result);
            sum += entry.getValue();
        }if (builder.length()>9){
            builder.setLength(builder.length()-3);
        }if (sum != 0)
            return builder.toString();
        return "";
    }

    public static void main(String[] args) {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        System.out.println(stockSummary(art,cd));

    }
}
