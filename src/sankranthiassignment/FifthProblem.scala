package sankranthiassignment

object FifthProblem 
{
   def main(args: Array[String])
   {
       var z = new Array[Int](10)
     
       z = Array(1,9,999,90,5,58,67,67,67,67,23,45,122)
      
       var comp = 67
       
       var len = z.size - 1
       
       var lessval=0
       var greaval=0  
       var equalval=0 
       
       for(i <-  len to 0 by -1 )
       {
         
         if( z(i) < comp   )
         {
           lessval = lessval + 1 
         }
         
         else if( z(i) == comp  )
         {
           equalval = equalval + 1
         }
         
         else if( z(i) > comp   )
         {
           greaval = greaval + 1
         }
         
       }
       
       println("Lesser than "+comp+" is "+lessval + "  "+"equal value to "+comp+" is "+ equalval + "  " 
           + "greater than "+comp+" is "+greaval )
       
       (lessval , equalval , greaval)
   
   }
}