package medium;

public class MaxAreaSolution {
    public int maxArea(int[] height) {
        int result = 0;
        int len = height.length;
        if (len <= 1) {
            return result;
        }
        int boxLen = 0;
        for (int start = 0; start < len - 1; start++) {
            int startHigh = height[start];
            for (int end = start + 1; end < len; end++) {
                int endHigh = height[end];
                boxLen = end - start;
                result = Math.max(result, boxLen * (Math.min(startHigh, endHigh)));
            }
        }

        return result;
    }
}
