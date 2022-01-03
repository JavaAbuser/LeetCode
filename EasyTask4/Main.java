package EasyTask4;

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
