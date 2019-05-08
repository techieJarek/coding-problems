import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that given a list of non negative integers, arranges them such that they form the largest possible number.
 * For example, given [50, 2, 1, 9], the largest formed number is 95021.
 */
public class FormLargestNumber {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(2);
        list.add(1);
        list.add(9);

        List<Integer> orderedList = new ArrayList<>();

        while(!list.isEmpty()){
            int index = getIndexOfLargestNumber(list);
            orderedList.add(list.remove(index));
        }

        orderedList.forEach(number -> {
            System.out.print(number);
        });

    }

    private static int getIndexOfLargestNumber(List<Integer> list) {
        int index = 0;
        Integer candidate = null;
        for (int i=0; i<list.size(); i++){
            if(candidate == null || isLarger(list.get(i), candidate)){
                candidate = list.get(i);
                index = i;
            }
        }

        return index;
    }

    private static boolean isLarger(int isLargerCandidate, int comparedTo) {
        boolean isLarger = false;
        List<Integer> isLargerCandidateDigits = getDigits(isLargerCandidate);
        List<Integer> comparedToDigits = getDigits(comparedTo);

        int numberOfIterations = (comparedToDigits.size() > isLargerCandidateDigits.size())
                ? isLargerCandidateDigits.size()
                : comparedToDigits.size();

        for(int i=0; i < numberOfIterations; i++){
            if(isLargerCandidateDigits.get(i) > comparedToDigits.get(i)) {
                isLarger = true;
            }

        }
        return isLarger;
    }

    private static List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<>();

        while(number > 1){
            int quotient = number / 10;
            int remainder = number % 10;
            digits.add(0, remainder);
            number = number / 10;
        }

        return digits;
    }
}
