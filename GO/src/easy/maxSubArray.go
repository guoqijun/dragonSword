package easy

func maxSubArray(nums []int) int {
	length := len(nums)
	var ans int
	ans = nums[0]
	sum := 0
	for i := 0; i < length; i++ {
		sum = sum + nums[i]
		if sum < nums[i] {
			sum = nums[i]
		}

		if sum > ans {
			ans = sum
		}
	}

	return ans
}
