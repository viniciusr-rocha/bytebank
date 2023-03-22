class InternalSystem {

    fun authenticate(admin: Authenticated, password: Int) {
        if (admin.authenticate(password)) {
            println("Bem vindo ao Bytebank")
            return
        }
        println("Falha na autenticação")
    }
}