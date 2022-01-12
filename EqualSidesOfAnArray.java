package CodeWars;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        // your code
        int sum1 =0;
        int sum2 =0;
        if (arr.length>0 && arr.length<1000) {
            for (int i = 1; i < arr.length - 1; i++) {
                for (int j = 0; j < i; j++) {
                    sum1 += arr[j];
                }
                for (int j = arr.length - 1; j > i; j--) {
                    sum2 += arr[j];
                }
                if (sum1 == sum2) {
                    return i;
                }
                sum1 = 0;
                sum2 = 0;
            }
        }
        return -1;
        }



    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }
}
