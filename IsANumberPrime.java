package CodeWars;

public class IsANumberPrime {
    public static boolean isPrime(int num) {
        if (num < 0) return false;
        int numSquared = (int)Math.sqrt(num)+1;
        for (int i = 2; i < numSquared ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true; //TODO
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5099));
    }
}
