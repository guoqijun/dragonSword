package easy

func lengthOfLastWord(s string) int {
	var ans string
	var length int
	for i := 0; i < len(s); i++ {
		if s[i] == ' ' {
			ans = ""
		} else {
			ans = ans + string(s[i])
			length = len(ans)
		}
	}

	return length
}
