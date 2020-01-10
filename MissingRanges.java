import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array where the range of elements are [0, 99] inclusive, return its
 * missing ranges.
 * For example, given [0, 1, 3, 50, 75], return [“2”, “4->49”, “51->74”, “76->99”]
 */

public class MissingRanges {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 0;
        array[1] = 1;
        array[2] = 3;
        array[3] = 50;
        array[4] = 75;

        int min = 1;
        int max = 99;

        getMissingRanges(array, min, max).forEach(range -> {
            System.out.println("Range : " + range);
        });
    }

    private static List<String> getMissingRanges(int[] array, int min, int max) {
        List<String> ranges = new ArrayList<>();

        if(array[0] > min) ranges.add(getRange(min, array[0]));

        for(int i=0; i<array.length; i++){
            int current = array[i];
            int prev = (i==0) ? -1 : array[i - 1];
            if(prev == -1) continue;
            if(current - prev > 1) ranges.add(getRange(prev+1, current-1));
        }

        if(array[array.length - 1] < max) ranges.add(getRange(array[array.length - 1], max));

        return ranges;
    }

    private static String getRange(int start, int end) {
        if(end - start == 0){
            return String.valueOf(start);
        }
        else{
            return String.valueOf(start) + " -> " + String.valueOf(end);
        }
    }
}
