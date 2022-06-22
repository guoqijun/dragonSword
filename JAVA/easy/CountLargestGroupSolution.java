package easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountLargestGroupSolution {
    public int countLargestGroup(int n) {
        int sum;
        Map<Integer, Integer> temp = new HashMap<>(n);
        for (int num = 1; num < n; num++) {
            sum = sum(num);
            Integer groupNum = temp.get(sum);
            if (groupNum == null) {
                temp.put(sum, 1);
            } else {
                temp.put(sum, groupNum + 1);
            }
        }
        //并列最多的组有多少个
        Map<Integer, Integer> haha = new HashMap<>(n);
        for (Integer sum2 : temp.keySet()) {
            Integer groupNum = temp.get(sum2);
            Integer count = haha.get(groupNum);
            if (count == null) {
                haha.put(groupNum, 1);
            } else {
                haha.put(groupNum, count + 1);
            }
        }
        // find max
        int max = 0;
        for (Integer aaaa : haha.keySet()) {
            Integer bb = haha.get(aaaa);
            max = Math.max(max, bb);
        }
        return max;
    }

    public int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
