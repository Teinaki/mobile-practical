fun defangAddress(address: String): String {
    var defangedAddr = ""
// Write your solution here
    defangedAddr = address.replace(".", "[.]")
    return defangedAddr
}
fun main() {
// Expected output:
    println(defangAddress("255.100.50.0")) // 255[.]100[.]50[.]0
}
