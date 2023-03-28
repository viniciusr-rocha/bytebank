package br.com.vinicius.bytebank.exceptions

class FailureAuthenticationException(
    message: String = "Falha na autenticacao",
) : Exception(message)