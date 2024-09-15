class Employee(var name: String, var age: Int, var salary: Int) {


    override fun toString(): String {
        return "Имя: $name, Возраст: $age, Зарплата: $salary"
    }
}