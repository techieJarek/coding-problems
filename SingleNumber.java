import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};

        System.out.println("Single number is : " + singleNumber(nums));

        //Improved solution - single pass
        System.out.println("Single number is : " + singleNumberInSinglePass(nums));

        //Improved solution - Space complexity O(1)
        System.out.println("Single number is : " + singleNumberXOR(nums));

    }

    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            if(map.get(nums[i])==null){
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1) return key;
        }

        return -1;
    }

    private static int singleNumberInSinglePass(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            if(map.containsKey(nums[i])) map.remove(nums[i]);
            else map.put(nums[i], 1);
        }
        return map.keySet().iterator().next();
    }

    public static int singleNumberXOR(int[] nums) {
        int num = 0;
        for (int x : nums) {
            num ^= x;
            System.out.println(num);
        }
        return num;
    }

}
