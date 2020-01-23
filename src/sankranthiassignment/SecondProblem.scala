package sankranthiassignment

object SecondProblem
{
   def main(args: Array[String])
  {
     
     var nums: List[Int] = List(1, 2, 3, 9, 2, 1)
     
     var rev: List[Int] = List()
  
   /* nums.patch(2, Nil, 1)
    println(nums)*/
     /*nums.drop(3)
      println(nums)*/
     
     rev = nums.patch(2 , Nil , 1)
     
    //println(rev)
    
    
    println(rev,nums.slice(2, 3))
    
    (rev,nums.take(2))
    
  }
}