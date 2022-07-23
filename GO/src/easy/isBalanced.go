package easy

import "fmt"

var record map[int]int
var ret = true

func isBalancedTest() {
	//输入：root = [3,9,20,null,null,15,7]

	root := &TreeNode{Val: 1}
	root2 := &TreeNode{Val: 2}
	//root3 := &TreeNode{Val: 20}
	//root4 := &TreeNode{Val: 15}
	//root5 := &TreeNode{Val: 7}
	//
	//root.Left = root2
	//root.Right = root3
	//root3.Left = root4
	//root3.Right = root5

	root.Left = root2
	ret := isBalanced(root)

	fmt.Println(ret)
}

func isBalanced(root *TreeNode) bool {

	if root == nil {
		return true
	}
	if root.Left == nil && root.Right == nil {
		return true
	}

	record = make(map[int]int)
	getHeight(root, 0)
	return ret
}

func getHeight(root *TreeNode, height int) {
	if root == nil {
		return
	}
	height++
	if root.Left == nil && root.Right == nil {
		record[height] = height
		for index := range record {
			if record[index]-height > 1 || record[index]-height < -1 {
				ret = false
			}
		}
		return
	}

	getHeight(root.Left, height)
	getHeight(root.Right, height)
}
