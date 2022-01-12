package CodeWars;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        int north =0;
        int south =0;
        int west =0;
        int east =0;
        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n') north++;
            if (walk[i] == 's') south++;
            if (walk[i] == 'w') west++;
            if (walk[i] == 'e') east++;
        }
        if (walk.length == 10 && north==south&&west==east)
        return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s','w'}));
    }
}
