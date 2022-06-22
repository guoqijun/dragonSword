package hard;

import java.util.HashSet;

public class FirstMissingPositiveSolution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                numSet.add(num);
            }
        }
        int index = 1;
        for (; ; index++) {
            if (!numSet.contains(index)) {
                break;
            }
        }

        return index;
    }
}
