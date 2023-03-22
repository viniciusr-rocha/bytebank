package br.com.vinicius.bytebank.model.authentication

interface Authenticated {

    fun authenticate(password: Int): Boolean
}