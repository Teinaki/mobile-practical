fun main() {
    val nums = doubleArrayOf(45.3, 67.5, -45.6, 20.34, -33.0, 45.6)
// Write your solution here
    val numOf: Int = nums.count()
    var total: Double = 0.0

    for (num in nums)
    {
        total += num
    }

    total /= (numOf.toDouble())

    //val average = nums.average()

    println(total.toFloat())
// Expected output:
// Average: 16.69
}