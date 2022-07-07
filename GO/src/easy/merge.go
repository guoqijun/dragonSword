package easy

func merge(nums1 []int, m int, nums2 []int, n int) {
	ans := make([]int, 0, m+n)

	left, right := 0, 0

	for left != m || right != n {
		if left == m {
			ans = append(ans, nums2[right])
			right++
		} else if right == n {
			ans = append(ans, nums1[left])
			left++
		} else if nums1[left] > nums2[right] {
			ans = append(ans, nums2[right])
			right++
		} else {
			ans = append(ans, nums1[left])
			left++
		}
	}
	copy(nums1, ans)
}
