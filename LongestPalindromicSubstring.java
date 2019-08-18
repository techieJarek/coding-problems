/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args){
        String s = "babad";
        System.out.println("The longest palindromic susbstring is : " + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if(s==null || s.isEmpty()){
            return "";
        }
        int start = 0, end = 0;

        for(int i=0; i<s.length(); i++){
            int len1 = expandFromTheCentre(s, i , i);
            int len2 = expandFromTheCentre(s, i , i+1);
            int length = Math.max(len1, len2);

            if(length > end - start){
                start = i - (length - 1) / 2;
                end = i + (length / 2) + 1;
            }
        }

        return s.substring(start, end);
    }

    private static int expandFromTheCentre(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return  right - left - 1;
    }
}
