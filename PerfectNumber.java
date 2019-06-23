/**
 * A number is considered perfect if its digits sum up to exactly 10.
 *
 * Given a positive integer n, return the n-th perfect number.
 *
 * For example, given 1, you should return 19. Given 2, you should return 28.
 */

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
    public static void main(String[] args){
        Integer number = 25301;

        Integer perfectNumber = calculatePerfectNumber(number);

        System.out.println("Perfect number is : " + perfectNumber);
    }

    private static Integer calculatePerfectNumber(Integer number) {
        List<Integer> digits = getDigits(number);

        int sum = digits.stream().mapToInt(Integer::intValue).sum();

        if(10 - sum < 0){
            System.out.println("no perfect number found");
            return null;
        }

        return (number * 10) + (10 - sum);
    }

    private static List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<>();

        while(number >= 1){
            int quotient = number / 10;
            int remainder = number % 10;
            digits.add(0, remainder);
            number = number / 10;
        }

        return digits;
    }
}
