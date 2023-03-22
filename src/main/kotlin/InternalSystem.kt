import employee.EmployeeAdmin

class InternalSystem {

    fun authenticate(employeeAdmin: EmployeeAdmin, password: Int) {
        if (employeeAdmin.authentication(password)) {
            println("Bem vindo ao Bytebank")
            return
        }
        println("Falha na autenticação")
    }
}