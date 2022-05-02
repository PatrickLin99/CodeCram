<img width="1020" alt="截圖 2022-05-02 下午5 51 31" src="https://user-images.githubusercontent.com/61774466/166216303-cf34fb06-7030-4a5c-8c80-aead29f07362.png">

```
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution{
    fun isValidBST(root: TreeNode?): Boolean {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }

    private fun helper(node: TreeNode?, min: Long, max: Long): Boolean {
        if(node == null) return true
        if(node.`val` <= min || node.`val` >= max) return false
        return helper(node.left, min, node.`val`.toLong()) && helper(node.right, node.`val`.toLong(), max)
    }
}
```
