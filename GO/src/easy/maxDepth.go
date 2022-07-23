package easy

func maxDepth(root *TreeNode) int {
	return check(root, 0)
}

func check(root *TreeNode, deep int) int {
	if root == nil {
		return deep
	}

	left := check(root.Left, deep+1)
	right := check(root.Right, deep+1)
	if left > right {
		return left
	} else {
		return right
	}
}
