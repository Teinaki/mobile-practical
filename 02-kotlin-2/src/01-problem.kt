open class Employee(var id: Int, val firstName: String, val lastName: String, val salary: Int) {
    override fun toString() = "${firstName} ${lastName}"
}
// Write your SoftwareDeveloper class here
class SoftwareDeveloper(id: Int, firstName: String, lastName: String, salary: Int,val favProgLang: String) : Employee(id, firstName, lastName, salary) {
}
// Write your Manager class here
class Manager(id: Int, firstName: String, lastName: String, salary: Int, val employees: MutableList<Employee>) : Employee(id, firstName, lastName, salary) {
    fun add(dev: Employee){
        employees.add(dev)
    }

    fun remove(dev: Employee){
        employees.remove(dev)
    }

    fun display(){
        for (employee in employees){
            println(employee)
        }
    }
}
fun main() {
    val sftDevOne = SoftwareDeveloper(1, "Bert", "Watts", 100000, "Cobol")
    val sftDevTwo = SoftwareDeveloper(2, "Sara", "Cain", 75000, "Perl")
    val sftDevThree = SoftwareDeveloper(3, "Samantha", "Baker", 75000, "PHP")
    val manager = Manager(4, "Owen", "James", 150000, mutableListOf(sftDevOne, sftDevTwo))
// Write your solution here
    manager.add(sftDevThree)
    manager.remove(sftDevOne)
    manager.display()
// Expected output:
// Sara Cain
// Samantha Baker
}

/*
Write two classes called SoftwareDeveloper & Manager which inherit from the given Employee class. The
SoftwareDeveloper class has one additional class property called favProgLang of type String.

The Manager class also has one additional class property called employees of type MutableList<Employee> & three
functions which add, remove & display all managed employees.
Use the three SoftwareDeveloper objects & Manager object in the main function to display the expected
output.
*/