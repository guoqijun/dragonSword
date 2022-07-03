package easy

import "sort"

func removeElement(nums []int, val int) int {
	sort.Ints(nums)

	left, right := 0, 0
	for ; right < len(nums); right++ {
		if nums[right] == val {
		} else {
			nums[left] = nums[right]
			left++
		}
	}

	return left
}
