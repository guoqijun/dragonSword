package medium;

public class LengthOfLISSolution {
    //[10,9,2,5,3,7,101,18]
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return 1;
        }
        int[] dp = new int[len];
        dp[0] = 1;

        int indexDp = 1;
        int result = 1;
        for (int index = 1; index < len; index++) {
            indexDp = 1;
            for (int i = 0; i < index; i++) {
                if (nums[index] > nums[i]) {
                    indexDp = Math.max(indexDp, dp[i] + 1);
                }
            }

            dp[index] = indexDp;
            result = Math.max(result, dp[index]);
        }

        return result;
    }

    //[0,1,0,3,2,3]
    public int lengthOfLIS2(int[] nums) {
        int result = 1;
        int len = nums.length;

        for (int index = 0; index < len; index++) {
            int dist = nums[index];
            int tempResult = 1;
            for (int move = index; move < len; move++) {
                if (nums[move] > dist) {
                    tempResult++;
                    dist = nums[move];
                }
            }
            result = Math.max(result, tempResult);
        }

        return result;
    }
}
