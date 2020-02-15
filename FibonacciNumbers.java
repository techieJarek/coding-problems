import java.time.Instant;
/**
 * Write a function that computes Fibonacci sequence.
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
 * and each subsequent number is the sum of the previous two.
 * As an example, here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 */
public class FibonacciNumber {

    public static void main(String[] args){
        int n = 40;
        Instant before = Instant.now();
        System.out.println("Fibonacci Number for n "+ n + " equals : " + fib(n));
        Instant after = Instant.now();
        System.out.println(after.toEpochMilli() - before.toEpochMilli());

        before = Instant.now();
        System.out.println("Fibonacci Number for n "+ n + " with memo equals : " + fibWithMemo(n));
        after = Instant.now();
        System.out.println(after.toEpochMilli() - before.toEpochMilli());

    }

    private static int fib(int N) {
        if(N<=1) return N;
        return fib(N-1)+fib(N-2);
    }

    private static int fibWithMemo(int N) {
        return getFibWithMemo(N,new int[N+1]);
    }

    private static int getFibWithMemo(int N, int[] memo){
        if(N<=1) return N;
        if(memo[N]!=0) return memo[N];
        memo[N]=fib(N-1)+fib(N-2);
        return memo[N];
    }
}

