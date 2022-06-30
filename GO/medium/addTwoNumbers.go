package medium

type ListNode struct {
	Val  int
	Next *ListNode
}

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	var temp1 int
	var temp2 int

	var tail *ListNode
	var head *ListNode
	carry := 0

	for {
		temp1 = 0
		temp2 = 0
		if l1 != nil {
			temp1 = l1.Val
			l1 = l1.Next
		}

		if l2 != nil {
			temp2 = l2.Val
			l2 = l2.Next
		}

		sum := temp2 + temp1 + carry
		carry = sum % 10
		sum = sum / 10

		if head == nil {
			head = &ListNode{Val: sum}
			tail = head
		} else {
			tail.Next = &ListNode{Val: sum}
			tail = tail.Next
		}

		if l1 == nil && l2 == nil {
			break
		}
	}

	if carry > 0 {
		tail.Next = &ListNode{Val: carry}
	}
	return head
}
