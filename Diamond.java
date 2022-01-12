package CodeWars;


public class Diamond {
    public static String print(int n) {
        // TODO your code here
        if (n % 2 == 0 || n <= 0  )return null;
       String start = "*".repeat(n);
       String[] strings = new String[n/2+1];
       StringBuilder ch = new StringBuilder();
        strings[0] = start;
        char[]  chars = start.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            chars[i] = ' ';
            chars[chars.length-1-i] = ' ';
            for (char a: chars){
                ch.append(a);
            }
            strings[i+1] = ch.toString();
            ch.setLength(0);
        }
        for (int i = strings.length-1; i >0; i--) {
            ch.append(strings[i].stripTrailing()+"\n");
        }
        for (int i = 0; i < strings.length; i++) {
            ch.append(strings[i].stripTrailing()+"\n");
        }


        return ch.toString();
    }

    public static void main(String[] args) {
        System.out.println(print(13));
    }
}
