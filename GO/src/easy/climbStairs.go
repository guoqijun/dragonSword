package easy

func climbStairs(n int) int {
	if n == 1 || n == 2 {
		return n
	}
	df := make([]int, n+1)
	df[0] = 0
	df[1] = 1
	df[2] = 2

	for i := 3; i <= n; i++ {
		df[i] = df[i-1] + df[i-2]
	}
	return df[n]
}
