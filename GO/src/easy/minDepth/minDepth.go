package minDepth

import "fmt"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

//程序入口
func main() {
	root := &TreeNode{Val: 1}
	root2 := &TreeNode{Val: 2}
	root3 := &TreeNode{Val: 20}
	root4 := &TreeNode{Val: 15}
	root5 := &TreeNode{Val: 7}

	root.Left = root2
	root.Right = root3
	root3.Left = root4
	root3.Right = root5

	ret := minDepth(root)
	fmt.Println(ret)
}

var ret int

func minDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	if root.Left == nil && root.Right == nil {
		return 1
	}
	record = make(map[int]int)

	getHeight(root, 0)
	for index := range record {
		fmt.Println(record[index])
		ret = min(ret, record[index])
	}

	return ret
}

func min(x int, y int) int {
	if x > y {
		return y
	}

	return x
}

var record map[int]int

func getHeight(root *TreeNode, height int) {
	if root == nil {
		return
	}
	height++
	if root.Left == nil && root.Right == nil {
		record[height] = height
		ret = height
		return
	}

	getHeight(root.Left, height)
	getHeight(root.Right, height)
}
