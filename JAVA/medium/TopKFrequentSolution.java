package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentSolution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> count = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            Integer value = count.get(nums[index]);
            if (value != null) {
                count.put(nums[index], value + 1);
            } else {
                count.put(nums[index], 1);
            }
        }
        for (int num = 0; num < k ; num ++) {
            int max = 0;
            int maxKey = 0;
            for (Integer key : count.keySet()) {
                Integer value = count.get(key);
                if (max < value) {
                    max = value;
                    maxKey = key;
                }
            }

            count.remove(maxKey);
            result[num] = maxKey;
        }

        return result;
    }
}
