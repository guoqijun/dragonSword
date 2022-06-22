package easy;

public class ContainsNearbyDuplicateSolution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length && j - i <= k; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsNearbyDuplicateSolution solution = new ContainsNearbyDuplicateSolution();
        int[] nums = new int[]{1, 2, 3, 1};
        boolean result = solution.containsNearbyDuplicate(nums, 3);
        System.out.println(result);
    }
}
