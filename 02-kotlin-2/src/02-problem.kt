class Stack<String>() {
    private val els = mutableListOf<String>()
    fun push(el: String) = els.add(el)
    fun peek(): String = els.last()
    fun pop(): String = els.removeAt(els.size - 1)
    fun isEmpty() = els.isEmpty()
    fun size() = els.size
    override fun toString() = "Stack[${els.joinToString()}]"
}
fun main() {
    val stack: Stack<String> = Stack()
    stack.push("Django")
    stack.push("Laravel")
    stack.push("Ruby on Rails")
    stack.push("Spring")
// Write your solution here
    if(!stack.isEmpty()) {
        stack.pop()
        println(stack)
        println("${stack.peek()} is at the top of the stack")
        println("There are ${stack.size()} item(s) in the stack ")
    }
// Expected output:
// Stack[Django, Laravel, Ruby on Rails]
// Ruby on Rails is at the top of the stack
// There are 3 item(s) in the stack
}
/*
You have been given a class called Stack of type String. Use the Stack object in the main function to display
the expected output.
*/