package easy;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                    s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ||
                    s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                str.append(s.charAt(i));
            }
        }

        String newS = str.toString();

        System.out.println(newS);
        System.out.println(str.reverse().toString());

        return newS.equalsIgnoreCase(str.reverse().toString());
    }


    public static void main(String[] args) {
        IsPalindrome solution = new IsPalindrome();
        boolean result = solution.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }
}
