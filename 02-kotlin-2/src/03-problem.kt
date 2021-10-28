class Stack2<String>() {
    private val els = mutableListOf<String>()
    fun push(el: String) = els.add(el)
    fun peek(): String = els.last()
    fun pop(): String = els.removeAt(els.size - 1)
    fun isEmpty() = els.isEmpty()
    fun size() = els.size
    override fun toString() = "Stack[${els.joinToString()}]"
}
fun main() {
    val stack2: Stack2<String> = Stack2()
// Write your solution here
    print("Enter some text: ")
    val input= readLine().toString()
    //input.reverse()
    input.toCharArray()

    for(i in input.indices) {
        stack2.push(input[i].toString())
    }
    var str = ""
    for(i in input.indices){
        str += stack2.pop()
    }
    println(str)
// Expected output:
// Enter some text: John Doe
// eoD nhoJ
}
/*
You have been given a class called Stack of type String. Use the Stack object in the main function & the
readLine function to reverse the user's input.
 */