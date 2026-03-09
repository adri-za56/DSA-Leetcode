class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int digit = x;

        while (digit != 0) {
            reverse = reverse * 10 + (digit % 10);
            digit = digit / 10;
        }

        return reverse == x;
    }
}S
