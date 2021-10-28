fun removeDuplicates(nums: IntArray): Int {
// Write your solution here
    val distinct = nums.toSet().toList();

    return distinct.size;
}
fun main() {
// Expected output:
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 2, 2, 3, 3, 4))) // 5
}
