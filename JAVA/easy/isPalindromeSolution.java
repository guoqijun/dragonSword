package easy;

import medium.ConvertSolution;

public class isPalindromeSolution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int raw = x;
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return result == raw;
    }

    public static void main(String[] args) {
        isPalindromeSolution isPalindromeSolution = new isPalindromeSolution();
        boolean result = isPalindromeSolution.isPalindrome(121);
        System.out.println(result);
    }
}
