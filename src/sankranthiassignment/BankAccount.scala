package sankranthiassignment

class BankAccount(initialBalance: Double)
{
private var balance:Double = initialBalance

var dcount:Int = 0
var wcount:Int=0

def deposit(amount: Double) = { balance += amount; dcount = dcount+1;balance }

def withdraw(amount: Double) = { balance -= amount; wcount = wcount+1;balance }

}