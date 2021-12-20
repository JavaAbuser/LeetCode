package EasyTask1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Max Steblevskiy(JavaAbuser) on 20.12.21
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
 * Return a list of pairs in ascending order(with respect to pairs)
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 8, -10, 23, 19, -4, -14, 27};
        System.out.println(minimumAbsDifference(arr));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min, maxAfterMin, minDifference;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        min = arr[0];
        maxAfterMin = arr[1];
        minDifference = Math.abs(maxAfterMin - min);
        for(int i = 0; i < arr.length - 1; i++){
            min = arr[i];
            maxAfterMin = arr[i + 1];
            if(Math.abs(maxAfterMin - min) < minDifference){
                minDifference = Math.abs(maxAfterMin - min);
            }
        }
        for(int k = 0; k < arr.length - 1; k++){
            min = arr[k];
            maxAfterMin = arr[k + 1];
            if(Math.abs(maxAfterMin - min) == minDifference){
                list2 = new ArrayList<>();
                list2.add(min);
                list2.add(maxAfterMin);
                list.add(list2);
            }
        }
        return list;
    }
}
