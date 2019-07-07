import java.util.*;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class FindTwoNumbersAddingToTarget {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(4,7,5,6,1);
        List<Integer> list2 = Arrays.asList(14,7,5,6,-4);

        printIndices(list1, 10);
        printIndices(list2, 10);
    }

    private static void printIndices(List<Integer> list, int target) {
        Map<Integer, Integer>visitedNumbers = new HashMap<>();
        for(int i=0; i < list.size(); i++){
            if(visitedNumbers.get(target - list.get(i))!=null){
                System.out.println(
                        "Pair of indices in list which point to the numbers adding up to a target: "
                                + target + ", is: " + visitedNumbers.get(target - list.get(i)) + ", " + i);
                return;
            }
            visitedNumbers.put(list.get(i), i);
        }
    }
}
