package CodeWars;

import java.util.ArrayList;

public class NumberInExpanded {
    public static String expandedForm(int num)
    {
        //your code here
        ArrayList<Integer> list = new ArrayList<>();
        String s = String.valueOf(num);
        int delitel = (int) Math.pow(10,s.length()-1);
        while (delitel > 0){
            int target = num - (num% delitel);
            list.add(target);
            num = num-target;
            delitel /=10;
        }
        StringBuilder builder = new StringBuilder();
        for (Integer integer : list) {
            if (integer != 0){
                builder.append(integer).append(" + ");
            }
        }
        return builder.delete(builder.length()-3,builder.length()).toString();
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(42));
        System.out.println(expandedForm(70304));
    }
}
