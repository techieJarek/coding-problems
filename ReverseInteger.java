import java.util.ArrayList;
import java.util.List;

/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
[−2^31,  2^31 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {
    public static void main(String[] args){
        System.out.println("Reversed int : " + reverse(-123));
        System.out.println("Reversed int alternative approach: " + reverseAlternativeApproach(-123));
    }
    
    private static int reverseAlternativeApproach(int num) {
        int reversed = 0;
        while(num != 0){
            if(reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && num % 10 > 7 )) return 0;
            if(reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE && num % 10 < -8) return 0;
            reversed = (reversed * 10) + (num % 10);
            num = num/10;
        }
        return reversed;
    }

    private static int reverse(int i) {
        if(i==0){
            return 0;
        }
        boolean isPositive = true;
        if(i < 0){
            isPositive = false;
            i = i * (-1);
        }
        int reversed = 0;
        List<Integer> digits = getDigits(i);
        int decimalIterator = 1;

        for(int digit: digits){
            try {
                int multipliedDigit = Math.multiplyExact(digit, decimalIterator);
                reversed = Math.addExact(reversed, multipliedDigit);
            } catch (ArithmeticException e) {
                return 0;
            }
            decimalIterator = decimalIterator * 10;
        }

        if(reversed < 2147483647 + 1 || reversed > 2147483647){
            return 0;
        }

        return (isPositive) ? reversed : reversed * (-1);
    }

    private static List<Integer> getDigits(int i) {
        List<Integer> list = new ArrayList<>();

        while (i >= 1) {
            list.add(0, i % 10);
            i = i/10;
        }

        return list;
    }
}
