package easy;

import java.util.Scanner;

public class HUAER2Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        while (text.contains("$")) {
            for (int index = 0; index < text.length(); index++) {
                if (text.charAt(index) == '$') {
                    int firstNumIndex = index - 1;
                    while (text.charAt(firstNumIndex) != '$' && text.charAt(firstNumIndex) != '#' && firstNumIndex > 0) {
                        firstNumIndex--;
                    }
                    int firstNum;
                    if (firstNumIndex == 0) {
                        firstNum = Integer.parseInt(text.substring(firstNumIndex, index));
                    } else {
                        firstNum = Integer.parseInt(text.substring(firstNumIndex + 1, index));
                    }
                    int secondNumIndex = index + 1;
                    while (secondNumIndex < (text.length()) && text.charAt(secondNumIndex) != '$' && text.charAt(secondNumIndex) != '#') {
                        secondNumIndex++;
                    }
                    int secondNum;
                    if (secondNumIndex == text.length() - 1) {
                        secondNum = Integer.parseInt(text.substring(index));
                    } else {
                        secondNum = Integer.parseInt(text.substring(index + 1, secondNumIndex));
                    }
                    int ret = dora(firstNum, secondNum);
                    text = replaceOne(text, firstNum + "$" + secondNum, ret + "");
                    break;
                }
            }
        }

        while (text.contains("#")) {
            for (int index = 0; index < text.length(); index++) {
                if (text.charAt(index) == '#') {
                    int firstNumIndex = index - 1;
                    while (text.charAt(firstNumIndex) != '$' && text.charAt(firstNumIndex) != '#' && firstNumIndex > 0) {
                        firstNumIndex--;
                    }
                    int firstNum;
                    if (firstNumIndex == 0) {
                        firstNum = Integer.parseInt(text.substring(firstNumIndex, index));
                    } else {
                        firstNum = Integer.parseInt(text.substring(firstNumIndex + 1, index));
                    }
                    int secondNumIndex = index + 1;
                    while (secondNumIndex < (text.length()) && text.charAt(secondNumIndex) != '$' && text.charAt(secondNumIndex) != '#') {
                        secondNumIndex++;
                    }
                    int secondNum;
                    if (secondNumIndex == text.length() - 1) {
                        secondNum = Integer.parseInt(text.substring(index));
                    } else {
                        secondNum = Integer.parseInt(text.substring(index + 1, secondNumIndex));
                    }
                    int ret = jing(firstNum, secondNum);
                    text = replaceOne(text, firstNum + "#" + secondNum, ret + "");
                    break;
                }
            }

        }

        System.out.println(text);
    }

    public static String replaceOne(String source, String replace, String item) {
        for (int index = 0; index < source.length(); index++) {
            if (source.substring(index).startsWith(replace)) {
                return source.substring(0, index) + item + source.substring(index + replace.length());
            }
        }
        return source;
    }

    public static int jing(int x, int y) {
        return 2 * x + 3 * y + 4;
    }

    public static int dora(int x, int y) {
        return 3 * x + y + 2;
    }
}
