package sankranthiassignment

object FourthProblem 
{
   def main(args: Array[String])
   {
     
     var z = new Array[Int](10)
     
     z = Array(1,9,999,90,5,58,67,23,45,122)
     
     var len = z.size
     
    for(i <-  len-2 to 0 by -1)
    {
      for(j <-  len-1 to 0 by -1)
      {
          if(z(i) < z(j)  )
          {
              var temp = z(i)
             
              z(i) = z(j) 
              
              z(j) = temp
            
            
          }
      }
    }
     
      for(i <-  len-1 to 0 by -1)
    {
        println(z(i))
    }
      
      
      println("smallest: "+ z(len-1))
      
      println("largeest: "+ z(0))
      
     
   }
  
}