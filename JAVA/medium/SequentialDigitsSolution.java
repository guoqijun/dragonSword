package medium;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigitsSolution {
    public static void main(String[] args) {
        SequentialDigitsSolution sequentialDigitsSolution = new SequentialDigitsSolution();

        List<Integer> result = sequentialDigitsSolution.sequentialDigits(10, 100000000);

        System.out.println(result);

    }

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        int step = 1;

        for (int num = low; num <= high; ) {
            if (isSequential(num)) {
                result.add(num);
                String aa = String.valueOf(num);
                step = (int) (num + Math.pow(10, aa.length() - 1));
            }
            num = num + step;
        }

        return result;
    }

    public boolean isSequential(int num) {
        int yushu = num % 10;
        int shang;
        while (num >= 10) {
            shang = yushu;
            num = num / 10;
            yushu = num % 10;
            if (yushu != shang - 1) {
                return false;
            }
        }

        return true;
    }
}
