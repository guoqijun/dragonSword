package easy

func sortedArrayToBST(nums []int) *TreeNode {
	return sortedArrayToBSTSort(nums, 0, len(nums)-1)
}

func sortedArrayToBSTSort(nums []int, left int, right int) *TreeNode {
	if left > right {
		return nil
	}

	mid := (left + right) / 2
	root := &TreeNode{Val: nums[mid]}
	root.Val = nums[mid]

	root.Left = sortedArrayToBSTSort(nums, left, mid-1)
	root.Right = sortedArrayToBSTSort(nums, mid+1, right)

	return root
}
