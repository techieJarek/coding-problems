import java.util.ArrayList;
import java.util.List;

/*
Given two strings A and B, return whether or not A can be shifted some number of times to get B.

For example, if A is abcde and B is cdeab, return true. If A is abc and B is acb, return false.
 */
public class CanABeShiftedToBecomeB {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "cdeab";

        System.out.println("Can A be shifted to become B? : " + canAbeShiftedToGetB(a, b));
    }

    private static boolean canAbeShiftedToGetB(String a, String b) {
        if(a == null || b ==null){
            return false;
        }
        if(a.length() != b.length()){
            return false;
        }

        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        List<Integer> firstCharIndexes = getCharIndexes(arrA[0], b);
        if(firstCharIndexes.isEmpty()){
            return false;
        }

        int lastIndex = arrA.length - 1;
        for(int indexInB : firstCharIndexes) {
            boolean matchFound = true;
            for(int i = 0; i < arrA.length -1; i++){
                if(arrA[i] != arrB[indexInB]) {
                    matchFound = false;
                    break;
                }
                indexInB++;
                if(indexInB > lastIndex){
                    indexInB = 0;
                }
            }
            if(matchFound){
                return true;
            }
        }

        return false;
    }

    private static List<Integer> getCharIndexes(char c, String word) {
        List<Integer> charIndexes = new ArrayList();
        int index = word.indexOf(c, 0);
        while (index >= 0){
            charIndexes.add(index);
            index = word.indexOf(c,index + 1);
        }
        return charIndexes;
    }
}
