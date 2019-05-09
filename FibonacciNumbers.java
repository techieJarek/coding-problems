import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that computes the list of the first 100 Fibonacci numbers.
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
 * and each subsequent number is the sum of the previous two.
 * As an example, here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 */
public class FibonacciNumbers {
    public static void main(String[] args){
        List<Double> sequence = new ArrayList<>();
        sequence.add(Double.valueOf(0));
        sequence.add(Double.valueOf(1));
        System.out.print("0, 1, ");
        for(int i=2; i<=100; i++){
            Double newNumber = sequence.get(i-2) + sequence.get(i-1);
            System.out.print(String.format("%.0f", newNumber) + ", ");
            sequence.add(newNumber);
        }
    }
}
