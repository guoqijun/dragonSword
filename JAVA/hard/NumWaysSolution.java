package hard;

import medium.RightSideViewSolution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumWaysSolution {
    Map<String, Integer> map = new HashMap<>();
    private int MOD = 1_000_000_007;

    public static void main(String[] args) {
        NumWaysSolution code = new NumWaysSolution();
        int[] A = new int[]{2, 5, 6, 0, 0, 1, 2};


        int result = code.numWays(27, 7);
        System.out.println(result);
    }

    public int numWays(int steps, int arrLen) {
        return numWaysToOrigin(0, steps, arrLen);
    }

    public int numWaysToOrigin(int index, int leftSteps, int arrLen) {
        if (leftSteps == 0) {
            if (index == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        String key = String.format("%d:%d", index, leftSteps);
        if (map.containsKey(key)) {
            return map.get(key);
        }
        //not move
        int result = numWaysToOrigin(index, leftSteps - 1, arrLen);

        if (index < arrLen - 1) {
            //move to right
            result += numWaysToOrigin(index + 1, leftSteps - 1, arrLen);
            result %= MOD;
        }
        if (index > 0) {
            //move to left
            result += numWaysToOrigin(index - 1, leftSteps - 1, arrLen);
            result %= MOD;
        }

        map.put(key, result);
        return result;
    }
}
