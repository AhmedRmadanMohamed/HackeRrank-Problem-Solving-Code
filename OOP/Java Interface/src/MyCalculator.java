import java.util.stream.*;
public class MyCalculator implements AdvancedArithmetic {
    int sum ;
    @Override
    public int divisor_sum(int n) {for (int i = 1; i <= n; i++) {if (n % i == 0) {sum += i;}}return sum;}

    @Override
    public int outer_sum(int n) {
        return IntStream.rangeClosed(1,n).filter(num -> n %num ==0).sum();
    }


}
