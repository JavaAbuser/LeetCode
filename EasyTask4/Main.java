package EasyTask4;

/**
 * @author Max Steblevskiy(JavaAbuser) on 03.01.22
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 4, 34, 4, 3};
        System.out.println(removeElement(arr, 4));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
