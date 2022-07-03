package easy

func mySqrt(x int) int {
	if x == 0 {
		return 0
	}
	for i := 0; i < x; i++ {
		if i*i > x {
			return i - 1
		}
	}

	return 1
}
