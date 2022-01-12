package CodeWars;

public class AlternatingSplit {
    public static String encrypt(final String text, final int n) {
        // Your code here
        if (text == null){
            return null;
        }
        if (text.equals("") || n <= 0)
        return text;
        String result = "";
        char [] chars = text.toCharArray();
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < chars.length; j++) {
                if ( j % 2 == 1){
                    odd.append(chars[j]);
                }
                if (j % 2 == 0){
                    even.append(chars[j]);
                }
            }
            result = odd.append(even).toString();
            odd.setLength(0);
            even.setLength(0);
            chars = result.toCharArray();
        }
        return result;
    }
    public static String rebulid(final String encryptedText){
        String result = encryptedText;
        StringBuilder sb = new StringBuilder();
        char[] chars = result.toCharArray();
        int len = chars.length;
        int step = len / 2;
        for (int j = 0; j < step; j++) {
            sb.append(chars[step+j]);
            sb.append(chars[j]);
        }
        if (chars.length % 2 ==1){
            sb.append(chars[chars.length-1]);
        }
        return sb.toString();

    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        if (encryptedText == null) {
            return null;
        }
        if (encryptedText.equals("") || n <= 0)
            return encryptedText;
        String result = encryptedText;
        for (int i = 0; i < n; i++) {
                result = rebulid(result);
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(encrypt("This is a test!", 3));
        System.out.println(decrypt(" Tah itse sits!", 3));

    }
}
