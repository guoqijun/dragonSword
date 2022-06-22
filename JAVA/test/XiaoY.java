package test;

public class XiaoY {
    /**
     * @param k 最多上k介楼梯
     * @param n 一共有n介楼梯
         * @return 组合数 f[i] 表示 第 i+1 层楼梯的组合数
     */
    public int xiaoYClimbStairs(int k, int n) {
        int[] f = new int[n];
        //第一层楼梯没办法，只有1种走法，就是走1步
        f[0] = 1;
        System.out.println(1 + "层楼梯的组合数：" + 1);
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= k; j++) {
                if (i - j < 0) {
                    //到了原点，发现能一步到目标阶梯，需要 +1
                    if (i < k) {
                        sum += 1;
                    }
                    break;
                }
                sum = (sum + f[i - j]) % 1000000007;
            }
            f[i] = sum % 1000000007;
            System.out.println(i + 1 + "层楼梯的组合数：" + sum);
        }
        return f[n - 1];
    }

    public static void main(String[] args) {
        XiaoY xiaoY = new XiaoY();
        int result = xiaoY.xiaoYClimbStairs(2, 5);
        System.out.println(result);
    }
}
