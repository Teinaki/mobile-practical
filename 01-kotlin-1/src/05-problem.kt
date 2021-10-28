fun main() {
    val courseCodesOne: MutableSet<String> = mutableSetOf("IN607", "IN721", "IN728", "IN732")
    val courseCodesTwo: MutableSet<String> = mutableSetOf("IN512", "IN607", "IN728", "IN732")
// Write your solution here
    val one = courseCodesOne.toMutableList()
    one.retainAll(courseCodesTwo)
    println(one)

    courseCodesOne.addAll(courseCodesTwo)
    println(courseCodesOne)
// Expected output:
// [IN607, IN728, IN732]
// [IN607, IN721, IN728, IN732, IN512]
}
