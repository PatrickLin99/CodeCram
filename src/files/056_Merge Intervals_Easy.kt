fun merge(intervals: Array<IntArray>): Array<IntArray> {

    intervals.sortBy { it[0] }

    val result = mutableListOf<IntArray>() 
    result.add(intervals[0])

    for (i in 1 until intervals.size) {
        val pre = result.last()

        if (intervals[i][0] <= pre[1]) {
            pre[1] = Math.max(pre[1], intervals[i][1])
        } else {
            result.add(intArrayOf(intervals[i][0], intervals[i][1]))
        }
    }
    return result.toTypedArray()
}
