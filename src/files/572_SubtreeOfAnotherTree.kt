package files

/**
 * 說明：
 * 確認母樹的形狀和子樹的長得一樣
 * example：
 *          root
 *            3
 *          /   \
 *         4     5
 *        / \
 *       1   2
 *
 *       subRoot
 *         4
 *        / \
 *       1   2
 */

/**
 * 解法：
 * 先在第一個 function 找到一樣的節點
 * 拿 root 的節點和 subRoot 的開頭節點比較
 * 找到一樣的之後進入下個 function
 * 開始比較左邊的數字是否相同，右邊的數字是否相同，
 * 直到兩邊都變成 null 就是回傳相同。
 */

/**
 * 時間複雜度：
 * 不清楚
 */

// 解法
fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if(root == null) {
        return false
    }
    return pairTree(root, subRoot) ||
            isSubtree(root.left, subRoot) ||
            isSubtree(root.right, subRoot)
}

fun pairTree(bigTree: TreeNode?, smallTree: TreeNode?): Boolean {
    if(bigTree == null && smallTree == null){
        return true
    }

    return bigTree?.`val` == smallTree?.`val` &&
            pairTree(bigTree?.left, smallTree?.left) &&
            pairTree(bigTree?.right, smallTree?.right)
}

// 解說
fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    // 母樹若是空的將不會相同
    if(root == null) {
        return false
    }
    // 先透過 '結點' 找到一樣的部分
    return pairTree(root, subRoot) ||
            isSubtree(root.left, subRoot) ||
            isSubtree(root.right, subRoot)
}

fun pairTree(bigTree: TreeNode?, smallTree: TreeNode?): Boolean {
    // 皆一樣
    if(bigTree == null && smallTree == null){
        return true
    }
    // 繼續望下比較  '節點'
    return bigTree?.`val` == smallTree?.`val` &&
            pairTree(bigTree?.left, smallTree?.left) &&
            pairTree(bigTree?.right, smallTree?.right)
}