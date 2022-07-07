package easy

type ListNode struct {
	Val  int
	Next *ListNode
}

func deleteDuplicates(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	ans := head
	left := head
	right := head.Next
	for ; right != nil; right = right.Next {
		if right.Val != left.Val {
			left.Val = right.Val
			left = left.Next
		}
	}

	left.Next = nil
	return ans
}
