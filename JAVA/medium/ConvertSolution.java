package medium;

import java.util.Arrays;

//6. Z 字形变换
public class ConvertSolution {
    public String convert(String s, int numRows) {
        if (s.equals("") || s.length() == 1 || numRows == 1) {
            return s;
        }
        int len = s.length();
        int numCol = s.length();

        char[][] zArray = new char[numCol][numRows];
        for (int i = 0; i < numCol; i++) {
            Arrays.fill(zArray[i], ' ');
        }
        int row = 0;
        int clo = 0;
        for (int i = 0; i < s.length(); i++) {
            zArray[clo][row] = s.charAt(i);
            if (row == (numRows - 1)) {
                row--;
                clo++;
            } else if ((clo) % (numRows - 1) == 0) {
                row++;
            } else {
                row--;
                clo++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCol; j++) {
                if (zArray[j][i] != ' ') {
                    stringBuilder.append(zArray[j][i]);
                }
            }
        }


        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ConvertSolution convertSolution = new ConvertSolution();
        String result = convertSolution.convert("AB", 1);
        System.out.println(result);
    }
}
