package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */

    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || r == c) 1 else pascal(c-1 ,r-1) + pascal(c, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
       def curBalance(curChars: List[Char], sum: Int): Boolean = {
         if (sum < 0) false
         else if (sum == 0 && curChars.isEmpty) true
         else if (sum != 0 && curChars.isEmpty) false
         else {
           if (curChars.head == '(') curBalance(curChars.tail, sum + 1)
           else if (curChars.head == ')') curBalance(curChars.tail, sum - 1)
           else curBalance(curChars.tail, sum)
         }
       }
      curBalance(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
