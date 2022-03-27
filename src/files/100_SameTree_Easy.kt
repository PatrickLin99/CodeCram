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
class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
      if (p?.`val` == null && q?.`val` == null) {
            return true
        } else if ((p?.`val` == null && q?.`val` != null) || (p?.`val` != null && q?.`val` == null)) {
            return false
        } else if (p!!.`val` != q!!.`val`) {
            return false
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        }
    }
}
