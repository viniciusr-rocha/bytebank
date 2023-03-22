package account

import employee.Employee

class BonusCalculator {
    var bonusTotal = 0.0
        private set

    fun execute(employee: Employee) {
        this.bonusTotal += employee.bonus
    }
}