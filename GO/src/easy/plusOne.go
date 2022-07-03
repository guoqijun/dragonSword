package easy

func plusOne(digits []int) []int {
	carry := 1
	index := len(digits) - 1
	for ; carry > 0 && index >= 0; index-- {
		sum := digits[index] + carry
		digits[index] = sum % 10
		carry = sum / 10
	}

	if carry > 0 {
		digits = make([]int, len(digits)+1)
		digits[0] = 1
	}

	return digits
}
