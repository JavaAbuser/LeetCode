package Task2;

/**
 * @author Max Steblevskiy(JavaAbuser) on 20.12.21
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 11, 7, 15};
        twoSum(arr, 9);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
            for(int k = i + 1; k < nums.length; k++){
                if(nums[i] + nums[k] == target){
                    arr[0] = i;
                    arr[1] = k;
                }
            }
        }
        return arr;
    }
}
