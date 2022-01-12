package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        // hackonacci me
        ArrayList<Double> arrayList = new ArrayList<>(10);
        for (double v : s) {
            arrayList.add(v);
        }
        double d0 = arrayList.get(0);
        double d1 = arrayList.get(1);
        double d2 = arrayList.get(2);
        for (int i = 0; i < n-3; i++) {
                double d3 = d0+d1+d2;
                arrayList.add(d3);
                d0 =d1;
                d1 = d2;
                d2 = d3;
        }
        double[] doubles = new double[n];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = arrayList.get(i);
        }

        return doubles;

    }

    public static void main(String[] args) {
        Xbonacci xbonacci = new Xbonacci();
        System.out.println(Arrays.toString(xbonacci.tribonacci(new double[]{0, 1, 1}, 10))) ;
    }
}
