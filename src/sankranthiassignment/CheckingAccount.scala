package sankranthiassignment

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double)
{
  
  private var balance = initialBalance

  
 override def deposit(amount: Double) = { balance = balance+amount-1 ; balance }

 override def withdraw(amount: Double) = { balance = balance- amount-1 ; balance }

  
}