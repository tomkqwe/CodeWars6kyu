package CodeWars;

public class CamelCaseMethod {

    public static String camelCase(String str) {
        // your code here
        String[] strings = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            char[] chars = string.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[0] = Character.toUpperCase(chars[0]);
                builder.append(chars[i]);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("test case"));
    }
}
