class Stack4<Char>() {
    private val els = mutableListOf<Char>()
    fun push(el: Char) = els.add(el)
    fun peek(): Char = els.last()
    fun pop(): Char = els.removeAt(els.size - 1)
    fun isEmpty() = els.isEmpty()
    fun size() = els.size
    override fun toString() = "Stack[${els.joinToString()}]"
}
fun isBalanced(sequence: String) : Boolean{
    val stack: Stack4<Char> = Stack4()
    val map = mapOf(
        '(' to ')', ')' to '(',
        '[' to ']', ']' to '[',
        '{' to '}', '}' to '{'
    )
// Write your solution here
    sequence.toCharArray()
    for (i in sequence.indices) {
        if (sequence[i] == '(' || sequence[i] == '{' || sequence[i] == '[') {
            stack.push(sequence[i])
        }
        else if (sequence[i] == ')' || sequence[i] == '}' || sequence[i] == ']') {

            if(stack.isEmpty() || stack.peek() != map[sequence[i]]) return false
            else stack.pop()
        }
    }
    return stack.isEmpty()
}
fun main() {
// Expected output:
    println(isBalanced("{([])}")) // true
    println(isBalanced("{([")) // false
}
/*
You have been given a class called Stack of type Char & an incomplete function called isBalanced which
accepts a String parameter called sequence. Given a sequence containing only parentheses, curly brackets &
square brackets, determine if sequence is valid.
 */