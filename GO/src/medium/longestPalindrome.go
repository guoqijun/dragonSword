package medium

func longestPalindrome(s string) string {
	if s == "" || len(s) == 1 {
		return s
	}
	left, right := 0, 0
	for i := 0; i < len(s); i++ {
		left1, right1 := expandCenter(s, i, i)
		left2, right2 := expandCenter(s, i, i+1)
		if right1-left1 > right-left {
			left, right = left1, right1
		}
		if right2-left2 > right-left {
			left, right = left2, right2
		}
	}

	return s[left : right+1]
}

func expandCenter(s string, left int, right int) (int, int) {
	for ; left >= 0 && right < len(s) && s[left] == s[right]; left, right = left-1, right+1 {
	}

	return left + 1, right - 1
}
