package EasyTask3;

/**
 * @author Max Steblevskiy(JavaAbuser) on 22.12.21
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(100));
    }
    public static boolean isPalindrome(int x) {
        String x_str = String.valueOf(x);
        int x_len = x_str.length();
        int reverseI = x_len - 1;
        boolean isValid = false;
        for (int i = 0; i < x_len/2 + 1; i++) {
            isValid = x_str.charAt(i) == x_str.charAt(reverseI);
            if(!isValid) {
                break;
            }
            reverseI--;
        }
        return x >= 0 && isValid;
    }
}
