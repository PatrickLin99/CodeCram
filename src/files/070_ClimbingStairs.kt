package files
fun climbStairs(n: Int): Int {
    val table = IntArray(n+1)
    table[0] = 1
    table[1] = 1
    for(i in 2 until n+1) table[i]= table[i-1] +table[i-2]
    return table[n]
}