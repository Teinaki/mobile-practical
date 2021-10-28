// Example 1
//Input: num = 6
//Output: true
// Example 2
//Input: num = 2
//Output: false
fun isPerfectNumber(num: Int): Boolean {
// Write your solution here
    var temp = 0
    for (i in 1..num / 2) {
        if (num % i == 0) {
            temp += i
        }
    }
    return temp == num
}
fun main() {
// Expected output:
    println(isPerfectNumber(5)) // false
    println(isPerfectNumber(6)) // true
}