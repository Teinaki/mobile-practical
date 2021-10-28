import java.util.*

fun main() {
    val progLangsOne: MutableList<String> = mutableListOf("C#", "JavaScript", "Kotlin", "OCaml")
    val progLangsTwo: MutableList<String> = mutableListOf("C++", "Go", "Swift", "TypeScript")
// Write your solution here
// Expected output:
// [C#, JavaScript, Kotlin, OCAML, Prolog, C++, Swift]


    progLangsOne.add("Prolog")
    progLangsOne.addAll(progLangsTwo)
    progLangsOne.remove("Go")
    progLangsOne.remove("TypeScript")
    progLangsOne[3] = progLangsOne[3].uppercase()

    println(progLangsOne)
}