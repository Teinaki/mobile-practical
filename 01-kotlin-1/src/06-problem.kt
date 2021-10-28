fun main() {
    var seating = arrayOf<Array<Any>>()
    for (i in 0..4) {
        var seat = arrayOf<Any>()
        for (j in 0..4) {
            seat += 0
        }
        seating += seat
    }
// Write your solution here
    for ((i, seat) in seating.withIndex()) {
        when {
            i == 2 -> {
                for ((j, value) in seat.withIndex()) {
                    if (j == 3) {
                        print("$value ")
                    } else {
                        print("X ")
                    }
                }
            }
            i % 2 == 0 -> {
                for ((j, value) in seat.withIndex()) {
                    if (j == 4) {
                        print("X ")
                    } else {
                        print("$value ")
                    }
                }
            }
            else -> {
                for ( value in seat) {
                    print("$value ")
                }
            }
        }
        println()
    }
    println()
// Expected output:
// 0 0 0 0 X
// 0 0 0 0 0
// X X X 0 X
// 0 0 0 0 0
// 0 0 0 0 X
}