import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */
public class AnyTwoListNumbersAddUpToK {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10, 15, 3, 7);
        int k = 17;

        System.out.println("Executing solveBruteForce: ");
        solveBruteForce(list, k);

        System.out.println("Executing solveWithImprovement: ");
        solveWithImprovement(list, k);
        
        System.out.println("Executing solveUsingHashMap: ");
        solveUsingHashMap(list, k);

    }

    /**
     *
     * @param list
     * @param k
     *
     * OUTPUT:
     *
     * Executing solveBruteForce:
     * 10 + 15 = 25
     * 10 + 3 = 13
     * 10 + 7 = 17 Success
     * 15 + 10 = 25
     * 15 + 3 = 18
     * 15 + 7 = 22
     * 3 + 10 = 13
     * 3 + 15 = 18
     * 3 + 7 = 10
     * 7 + 10 = 17 Success
     * 7 + 15 = 22
     * 7 + 3 = 10
     *
     */
    private static void solveBruteForce(List<Integer> list, int k){
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
                if(i == j){
                    continue;
                }
                int sum = list.get(i) + list.get(j);

                System.out.print(list.get(i) + " + " + list.get(j) + " = " + sum);
                if(sum == k) {
                    System.out.print(" Success");
                }
                System.out.print("\n");
            }
        }
    }

    /**
     *
     * @param list
     * @param k
     *
     * OUTPUT:
     *
     * Executing solveWithImprovement:
     * 15 + 10 = 25
     * 3 + 10 = 13
     * 3 + 15 = 18
     * 7 + 10 = 17 Success
     * 7 + 15 = 22
     * 7 + 3 = 10
     *
     */
    private static void solveWithImprovement(List<Integer> list, int k) {
        List<Integer>alreadyTraversed = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            int currentlyTraversedNumber = list.get(i);
            alreadyTraversed.forEach(alreadyTraversedNumber -> {
                int sum = currentlyTraversedNumber + alreadyTraversedNumber;

                System.out.print(currentlyTraversedNumber + " + " + alreadyTraversedNumber + " = " + sum);
                if(sum == k) {
                    System.out.print(" Success");
                }
                System.out.print("\n");
            });

            alreadyTraversed.add(currentlyTraversedNumber);
        }
    }
    
     /**
     *
     * @param list
     * @param k
     *
     * OUTPUT:
     * 7 + 10 = 17 Success
     *
     */
    private static void solveUsingHashMap(List<Integer> list, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<list.size(); i++) {
            if(map.containsKey(k - list.get(i))){
                System.out.print(list.get(i) + " + " + (k - list.get(i)) + " = " + k + " Success\n");
            }
            map.put(list.get(i), i);
        }
    }
}
