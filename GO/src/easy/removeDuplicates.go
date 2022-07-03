package easy

func removeDuplicates(nums []int) int {
	len := len(nums)
	if len == 0 || len == 1 {
		return len
	}

	slow, fast := 1, 1

	for ; fast < len; fast++ {
		if nums[fast] != nums[fast-1] {
			nums[slow] = nums[fast]
			slow++
		}
	}

	return slow
}
