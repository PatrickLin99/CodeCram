<image src = "https://github.com/PatrickLin99/CodeCram/blob/e5d03bdb97e1d4d133373885308bb2b325471e29/src/files/attachment/417_PacificAtlanticWaterFlow.png"/>


```kotlin
class Solution {
 fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {

        val reachPacific = MutableList(heights.size) { MutableList(heights[0].size) { false } }
        val reachAtlantic = MutableList(heights.size) { MutableList(heights[0].size) { false } }

        heights.forEachIndexed { x, _ ->
            dfs(heights, -1, x, 0, reachPacific)
            dfs(heights, -1, x, heights[0].size - 1, reachAtlantic)
        }
        
        heights[0].forEachIndexed { y, _ ->
            dfs(heights, -1, 0, y, reachPacific)
            dfs(heights, -1, heights.size -1, y, reachAtlantic)
        }

        val result = mutableListOf<List<Int>>()

        heights.forEachIndexed { x, _ ->
            heights[0].forEachIndexed { y, _ ->
                if (reachAtlantic[x][y] && reachPacific[x][y]) {
                    result.add(listOf(x,y))
                }
            }
        }

        return result
    }

    fun dfs(
        heights: Array<IntArray>,
        preHeight: Int,
        x: Int,
        y: Int,
        reached: MutableList<MutableList<Boolean>>
    ) {
        if (isInvalidIndex(x, y, reached) || preHeight > heights[x][y] || reached[x][y]) return

        reached[x][y] = true

        dfs(heights, heights[x][y], x + 1, y, reached)
        dfs(heights, heights[x][y], x - 1, y, reached)
        dfs(heights, heights[x][y], x, y + 1, reached)
        dfs(heights, heights[x][y], x, y - 1, reached)

    }

    fun isInvalidIndex(x: Int, y: Int, flowed: MutableList<MutableList<Boolean>>): Boolean {
        return x < 0 || y < 0 || x >= flowed.size || y >= flowed[0].size
    }
}
```
