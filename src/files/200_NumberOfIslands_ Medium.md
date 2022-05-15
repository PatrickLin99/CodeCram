![螢幕錄製_2022-05-15_下午2_33_25_AdobeCreativeCloudExpress](https://user-images.githubusercontent.com/61774466/168460952-8a67602a-e25f-4c89-8747-b5faa0686f88.gif)

<img width="322" alt="截圖 2022-05-15 下午2 43 18" src="https://user-images.githubusercontent.com/61774466/168460975-d529ac13-8eaa-4d5d-bc19-a1153dc6b40c.png">

```
class Solution200 {
    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.isEmpty()) return 0
        var result = 0

        grid.forEachIndexed { i, it ->
            it.forEachIndexed { j, _ ->
                if (grid[i][j] == '1') {
                    result += dfs(grid, i, j)
                }
            }
        }
        return result
    }

    fun dfs(grid: Array<CharArray>, i: Int, j: Int): Int {
        if (i < 0 || j < 0 || i >= grid.size || j >= grid[0].size || grid[i][j] == '0') {
            return 0
        }
        grid[i][j] = '0'
        dfs(grid, i + 1, j)
        dfs(grid, i - 1, j)
        dfs(grid, i, j - 1)
        dfs(grid, i, j + 1)
        return 1
    }
}
```
