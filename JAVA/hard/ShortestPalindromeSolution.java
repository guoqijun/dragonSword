package hard;

public class ShortestPalindromeSolution {
    public String shortestPalindrome(String s) {
        String reverse = new StringBuffer(s).reverse().toString();

        for (int i = 0; i < reverse.length(); i++) {
            if (s.startsWith(reverse.substring(i))) {
                return reverse.substring(0, i) + s;
            }
        }
        return "";
    }
}
