package medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsSolution {
    private String letterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        result = fuck(result, digits);
        return result;
    }

    public List<String> fuck(List<String> result, String digits) {
        List<String> result2 = new ArrayList<>();

        if (digits.length() == 1) {
            String letter = letterMap[Integer.parseInt(String.valueOf(digits.charAt(0)))];

            for (int i = 0; i < letter.length(); i++) {
                result2.add(String.valueOf(letter.charAt(i)));
            }

            return result2;
        }

        if (digits.length() > 1) {
            //最后一个取出来
            String letter = letterMap[Integer.parseInt(String.valueOf(digits.charAt(digits.length() - 1)))];
            result = fuck(result, digits.substring(0, digits.length() - 1));

            for (int i = 0; i < letter.length(); i++) {

                String temp = String.valueOf(letter.charAt(i));
                for (int j = 0; j < result.size(); j++) {
                    result2.add(result.get(j) + temp);
                }
            }
        }

        return result2;
    }

    public static void main(String[] args) {
        LetterCombinationsSolution letterCombinationsSolution = new LetterCombinationsSolution();

        List<String> result = letterCombinationsSolution.letterCombinations("23");

        System.out.println(result);

    }
}
