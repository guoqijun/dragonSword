package easy

func isSymmetric(root *TreeNode) bool {
	return check2(root, root)
}

func check2(p, q *TreeNode) bool {
	if p == nil && q == nil {
		return true
	}
	if p == nil || q == nil {
		return false
	}
	return p.Val == q.Val && check2(p.Left, q.Right) && check2(p.Right, q.Left)
}
