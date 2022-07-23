package easy

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func inorderTraversal(root *TreeNode) []int {
	ans := make([]int, 0)
	loop(ans, root)
	return ans
}

func loop(ans []int, root *TreeNode) []int {
	if root != nil {
		loop(ans, root.Left)
		ans = append(ans, root.Val)
		loop(ans, root.Right)
	}

	return ans
}
