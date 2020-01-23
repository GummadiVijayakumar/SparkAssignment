package sankranthiassignment

object FirstProblem 
{
   def main(args: Array[String])
  {
      val nums: List[Int] = List(1, 2, 3, 9, 2, 1)
  
      var rev: List[Int] = List()

      rev = nums.reverse 
      val n = nums.length
      
      var a = 0;
      
      for(a <- 0 to n-1)
      {
        if(nums(a) != rev(a))
         return println("not palindrome")
        
      }
      
     println("palindrome")
  }
}