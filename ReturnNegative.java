package CodeWars;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReturnNegative {
    public static int makeNegative(final int x) {

        if (x <  0)
        return x; // Your code here.
        return IntStream.of(x).map(operand -> operand*-1).max().getAsInt();
    }
}
