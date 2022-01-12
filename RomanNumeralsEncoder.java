package CodeWars;


import java.util.*;
import java.util.stream.Collectors;


public class RomanNumeralsEncoder {

    public static String solution(int n) {
        String[] thousands = new String[]{"","M","MM","MMM"};
        String[] hundred = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] units = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return thousands[n/1000] + hundred[(n%1000)/100]+ tens[(n%100)/10] + units[n%10];
    }

    public static void main(String[] args) {
        System.out.println(solution(67));
    }
}
