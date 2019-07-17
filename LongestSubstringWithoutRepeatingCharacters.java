import java.util.HashMap;
import java.util.Map;

/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){
        String str = "abcabcbb";

        System.out.println("Length Of Longest Substring : " + lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 1){
            return 1;
        }
        Map<Character, Integer> map = new HashMap();
        int candidateOutput = 0;
        int lengthOfCurrentSubstring = 0;
        String candidateSubstring ="";
        String currentSubString = "";
        int currentIndex = 0;

        while(currentIndex < s.length()){
            if(map.get(s.charAt(currentIndex)) != null){
                System.out.println("currentSubString = " + currentSubString + ", length = " + lengthOfCurrentSubstring);
                if(lengthOfCurrentSubstring > candidateOutput){
                    candidateOutput = lengthOfCurrentSubstring;
                    candidateSubstring = currentSubString;
                }
                currentIndex = map.get(s.charAt(currentIndex)) + 1;
                currentSubString = "";
                map.clear();
                lengthOfCurrentSubstring = 0;
            }
            else{
                currentSubString = currentSubString + s.charAt(currentIndex);
                map.put(s.charAt(currentIndex), currentIndex);
                currentIndex++;
                lengthOfCurrentSubstring++;
            }
        }

        if(lengthOfCurrentSubstring > candidateOutput){
            candidateOutput = lengthOfCurrentSubstring;
            candidateSubstring = currentSubString;
        }

        System.out.println("candidateSubstring = " + candidateSubstring + ", length = " + candidateOutput);

        return candidateOutput;
    }
}
