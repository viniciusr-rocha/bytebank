interface Authenticated {

    var password: Int

    fun authenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}