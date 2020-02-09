import java.util.HashMap;
import java.util.Map;


/**
 * A girl is walking along an apple orchard with a bag in each hand.
 * She likes to pick apples from each tree as she goes along,
 * but is meticulous about not putting different kinds of apples in the same bag.
 *
 * Given an input describing the types of apples she will pass on her path, in order,
 * determine the length of the longest portion of her path that consists of just two types of apple trees.
 *
 * For example, given the input [2, 1, 2, 3, 3, 1, 3, 5], the longest portion will involve types 1 and 3,
 * with a length of four.
 */
public class AppleOrchardTree {
    public static void main(String[] args){
        int[] array = {2, 1, 2, 3, 3, 1, 3, 3, 5};
        System.out.println("longest portion :" + getLongestPortion(array));
    }

    public static int getLongestPortion (int[] input){
        int i=0,j=0,candidate=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(j<input.length) {
            if(map.get(input[j]) != null) {
                map.put(input[j], map.get(input[j]) + 1);
            } else {
                map.put(input[j],1);
            }
            if(map.keySet().size()>2){
                if(candidate < j-i){
                    candidate = j-i;
                }
                while(map.keySet().size()>2){
                    if(map.get(input[i]) > 1) {
                        map.put(input[i], map.get(input[i]) - 1);
                    } else {
                        map.remove(input[i]);
                    }
                    i++;
                }
            }
            j++;
        }

        if(input.length == 2 && map.keySet().size()==2) candidate = 2;

        return candidate;
    }
}
