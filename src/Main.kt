fun main() {
    var empOne = Employee("Виктор", 22,10000)
    var empTwo = Employee("Дмитрий", 32,34433)
    var empThree = Employee("Екатерина", 20,33554)
    var empFour = Employee("Елена", 23,64343)
    var empFive = Employee("Андрей", 25,135466)

    var array = arrayOf(empOne,empTwo,empThree,empFour,empFive)


    val sortedEmployeeName = array.sortedWith(compareBy({it.name}))
    val sortedEmployeeAge = array.sortedWith(compareBy { it.age })
    val sortedEmployeeSalary = array.sortedWith(compareBy { it.salary } )

    println(sortedEmployeeSalary.toString()) // Сортировка по зп
    println("-----------------------")
    println(sortedEmployeeAge.toString()) // Сортировка по Возрасту
    println("---------------------")
    println(sortedEmployeeName.toString()) // Сортировка по имени
}