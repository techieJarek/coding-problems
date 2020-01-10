/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println("1234321 is palindrome = " + isPalindrome(1234321));
        System.out.println("1234567 is palindrome = " + isPalindrome(1234567));
    }

    private static boolean isPalindrome(int num) {
        int div = 1;
        while(num / div > 10){
            div*=10;
        }

        while(num != 0){
            int r = num % 10;
            int l = num / div;
            if(r != l) return false;
            num = (num % div) / 10;
            div /= 100;
        }
        return true;
    }
}
