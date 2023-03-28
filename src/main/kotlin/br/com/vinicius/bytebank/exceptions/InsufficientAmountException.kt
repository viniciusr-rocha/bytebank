package br.com.vinicius.bytebank.exceptions

class InsufficientAmountException(
    message: String = "O saldo é insuficiente",
) : Exception(message)