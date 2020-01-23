package sankranthiassignment

class DSavingsAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) 
{
     private var balance = initialBalance
     var depocount:Int = dcount
     var withcount:Int = wcount
      
      val ba = new BankAccount(100)
     
     ba.deposit(2000)
     ba.deposit(3000)
     ba.deposit(3456)
     ba.deposit(3423423)
     
     println(ba.dcount)
     
     ba.withdraw(4999)
     ba.withdraw(4099)
    
     println(ba.wcount)

      def earnMonthlyInterest() ={  
       
       if(ba.dcount <= 3)
       {
          def deposit(amount: Double) = { balance = balance+amount ; balance }
          
          println("deposit < 3")
       }
       
       else if(ba.dcount > 3)
       {
          def deposit(amount: Double) = { balance = balance+amount-1 ; balance }
          
          println("deposit > 3")


       }
       
         if(ba.wcount <= 3)
       {
          def withdraw(amount: Double) = { balance = balance+amount ; balance }
          
          println("withdraw < 3")

       
       }
       
       else if(ba.wcount > 3)
       {
          def withdraw(amount: Double) = { balance = balance+amount-1 ; balance }
          
          println("deposit > 3")

       }
       
     }
 
}