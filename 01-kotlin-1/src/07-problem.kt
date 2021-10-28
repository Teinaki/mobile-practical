fun generateSteps(numOfSteps: Int): MutableList<String> {
    val stepSeq: MutableList<String> = mutableListOf()
// Write your solution here
    for (i in 0 until numOfSteps){
        var value = ""
        for (j in 0..i){
            value += "#"
        }
        stepSeq.add(value)
    }
    return stepSeq
}
fun main() {
    for (step in generateSteps(4)) {
// Expected output:
        println(step) // #
// ##
// ###
// ####
    }
}