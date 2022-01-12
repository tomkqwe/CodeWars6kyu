package CodeWars;

public class RevRot {
    public static String revRot(String strng, int sz) {
        // your code
        if (sz < 1 || sz > strng.length()) return "";
        int start = 0;
        int end = sz;
        long sum = 0;
        StringBuilder builder = new StringBuilder();
        String[] strings = new String[strng.length()/sz];
        for (int i = 0; i < strings.length ; i++) {
            strings[i] = strng.substring(start,end);
            start+=sz;
            end+=sz;
        }
        for (int i = 0; i<strings.length;i++) {
            char[] chars =  strings[i].toCharArray();
            for (int j = 0; j< chars.length;j++){
                sum += (long)Math.pow(Integer.parseInt(chars[j]+""),3);
            }
             if (sum %2 == 0){
                strings[i] = new StringBuilder(strings[i]).reverse().toString();
            }else{
              char[] tmp = new char[chars.length];
                for (int j = 0; j < chars.length; j++) {
                    tmp[j] = chars[(j+1) % chars.length];
                    builder.append(tmp[j]);
                }
                strings[i] = builder.toString();
                builder.setLength(0);
            }

            sum = 0;
        } for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(revRot("563000655734469485",4));
    }
}


