package com.knoldus.impl

import com.knoldus.traits.NumberFunctions

class NumberFunctionsImpl extends NumberFunctions {

  /* checking if number is palindrome by checking first digit with last, second with second last and so on */
  override def isPalindrome(inputNumber: Int): Boolean = {
    val inputstr :String = inputNumber.toString
    val inputrev :String = inputstr.reverse

    if(inputstr == inputrev)
       true
    else
      false
  }


  /* calculate factorial multiply number from 1 to input number */
  override def factorial(inputNumber: Int): Int = {
    var factorial: Int = 1
    for (number <- 1 to inputNumber) {
      factorial = factorial * number
    }
    factorial
  }

}
