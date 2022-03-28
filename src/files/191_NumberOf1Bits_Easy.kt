package files

import kotlin.experimental.and

/**
 * 說明：
 * 在一串 32 bits 中，找到 1 有幾個，
 * example:
 * 0000 0000 0010 0011
 * output = 3
 */

/**
 * 解法：
 * 使用一個 while 迴圈
 * 當他不等於 0 的時候就會一直存在，
 * 判斷這串 bits 交集 1 後大於 0 代表最右邊的數字是 1
 * 我的總數就加 1
 * 接下來整串 bits 往右移一位
 * 並在開頭捕 0
 * 最後回傳我加總的數字
 */

/**
 * 時間複雜度：
 * oE
 */

// 解法
fun hammingWeight(n:Int):Int {
    var num = n
    var count = 0
    while(num != 0){
        if(num and 1 != 0){
            count ++
        }
        num = num ushr 1
    }
    return count
}

// 解說
fun NumberOfOneBits(n: Byte): Int {
    var num = n
    var count = 0
    val oneByt: Byte = 1
    val zeroByt: Byte = 0
    // 不為零的時候
    while (num.toInt() != 0) {
        /* 確認現在的 byte 是不是連擊 1 為 1
        *   example
        *  number = 111001
        *  and
        *  1      = 000001
        *  =
        *         = 000001
        * 相同都是 1 才會拿出
         */
        if (num and oneByt != zeroByt) {
            // 得到一個 1 得值
            count++
        }
        /*
        *   shr   = 往右移一個位元 (( 遇到負數
        *   ushr  = 往右一個位元，第一個位元捕 0
        *   example
        *   111001 shr 1  -> 111100
        *   111001 ushr 1 -> 011100
         */
        num = (num.toInt() ushr 1).toByte()
    }
    return count
}