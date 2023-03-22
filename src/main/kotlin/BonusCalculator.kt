import employee.Director
import employee.Employee
import employee.Manager

class BonusCalculator {
    var bonusTotal = 0.0
        private set

    fun calculate(employee: Employee) {
        this.bonusTotal += employee.bonus
    }

    fun calculate(manager: Manager) {
        this.bonusTotal += manager.bonus
    }

    fun calculate(director: Director) {
        this.bonusTotal += director.bonus
    }
}