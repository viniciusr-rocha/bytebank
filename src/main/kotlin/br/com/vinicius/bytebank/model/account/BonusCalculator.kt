package br.com.vinicius.bytebank.model.account

import br.com.vinicius.bytebank.model.employee.Employee

class BonusCalculator {
    var bonusTotal = 0.0
        private set

    fun execute(employee: Employee) {
        this.bonusTotal += employee.bonus
    }
}