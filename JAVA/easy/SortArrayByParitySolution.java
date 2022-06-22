package easy;

public class SortArrayByParitySolution {
    ////922. 按奇偶排序数组 II
    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int oddIndex = 1;
        int evenIndex = 0;
        for (int temp :
                A) {
            if (temp % 2 == 0) {
                result[evenIndex] = temp;
                evenIndex += 2;
            } else {
                result[oddIndex] = temp;
                oddIndex += 2;
            }
        }

        return result;
    }
}
