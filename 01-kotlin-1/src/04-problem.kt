fun main() {
    val softDrinks: MutableMap<String, Double>
            = mutableMapOf("Coca-Cola" to 2.00, "Fanta" to 0.90, "Sprite" to 1.10)
// Write your solution here
// Expected output:
// Total price: $6.50
    softDrinks.replace("Coca-Cola", 4.50)

    println("Total price $" + softDrinks.values.sum())
}
