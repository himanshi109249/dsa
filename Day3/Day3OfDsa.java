//https://leetcode.com/problems/palindrome-number/description/
package Day3;
class Day3OfDsa {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int x) {
        int reverse = 0;
        int originalNum = x;
        if (x < 0) {
            return false;
        }
        while (originalNum != 0) {
            int digit = originalNum % 10;
            reverse = reverse * 10 + digit;
            originalNum = originalNum / 10;
        }
        if (x == reverse) {
            return true;
        }

        return false;
    }
}