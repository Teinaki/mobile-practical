// Write your fizzBuzz function here
fun fizzBuzz(i: Int){
    if(i%3==0 && i%5==0) println("FizzBuzz")
    else
        if(i%5==0) println("Buzz")
        else
            if(i%3==0) println("Fizz")
            else
                println(i)
}
fun main() {
    for (i in 1..15 step 2) {
    // Write your solution here


        fizzBuzz(i)
    }
// Expected output:
// 1
// Fizz
// Buzz
// 7
// Fizz
// 11
// 13
// FizzBuzz
}