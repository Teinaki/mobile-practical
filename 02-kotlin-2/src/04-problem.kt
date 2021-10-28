class Stack3<Int>() {
    private val els = mutableListOf<Int>()
    fun push(el: Int) = els.add(el)
    fun peek(): Int = els.last()
    fun pop(): Int = els.removeAt(els.size - 1)
    fun isEmpty() = els.isEmpty()
    fun size() = els.size
    override fun toString() = "Stack[${els.joinToString()}]"
}
fun main() {
    val stack3: Stack3<Int> = Stack3()
// Write your solution here
    print("Enter a number: ")
    var input = readLine().toString().toInt()

    while (input > 0) {
        val r: Int = input % 2

        stack3.push(r)
        input /= 2
    }
    while (!stack3.isEmpty())
    {
        print(stack3.pop());
    }
// Expected output:
// Enter a number: 50
// 110010
}
/*
You have been given a class called Stack of type Int. Use the Stack object in the main function & the
readLine function to convert the user's input into binary.
 */