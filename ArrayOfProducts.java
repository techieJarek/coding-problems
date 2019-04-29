import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array
 * is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */
public class ArrayOfProducts {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int[] arrayOfProducts = getArrayOfProducts(list);
        System.out.println("Array of products: ");
        for(int number : arrayOfProducts){
            System.out.print(number + ", ");
        }
    }
    
    private static int[] getArrayOfProducts(List<Integer> list) {
        int[] array = new int[list.size()];

        Integer productOfAll = 1;

        for(int number : list){
            productOfAll *= number;
        }

        System.out.println("productOfAll : " + productOfAll);

        for(int i=0; i < list.size(); i++){
            array[i] = productOfAll / list.get(i);
        }

        return array;
    }
}
