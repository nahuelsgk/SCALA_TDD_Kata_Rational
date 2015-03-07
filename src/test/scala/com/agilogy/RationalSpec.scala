package com.agilogy

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class RationalSpec extends FlatSpec with ShouldMatchers {

  "Test 0:Rational addition of  0 + 0" should "return 0" in {
     Rational(0).add(Rational(0)) should be (Rational(0))
  }
  
  "Test 1:Rational addition of  1 + 0" should "return 1" in {
     Rational(1).add(Rational(0)) should be (Rational(1))
  }
  
  "Test 2:Rational addition of  2/5 + 1/5" should "return 3/5" in {
     Rational(2,5).add(Rational(1,5)) should be (Rational(3,5))
  }
  
  "Test 3:Rational addition of  1/4 + 1/4" should "return 1/2" in {
     Rational(1,4).add(Rational(1,4)) should be (Rational(1,2))
  }
  
  "Test 4:Rational addition of  1/2 + 1/3" should "return 5/6" in {
     Rational(1,2).add(Rational(1,3)) should be (Rational(5,6))
  }
  
  "Test 5:Rational addition of  1/2 + -1/3" should "return 1/6" in {
     Rational(1,2).add(Rational(-1,3)) should be (Rational(1,6))
  }
  
  "Test 6:Rational addition of  -1/2 + 2/4" should "return 0" in {
     Rational(-1,2).add(Rational(2,4)) should be (Rational(0))
  }
  
  "Test 7:Rational addition of  -1/2 + -3/4" should "return -5/4" in {
     Rational(-1,2).add(Rational(-3,4)) should be (Rational(-5,4))
  }
  
  "Test 8:Rational addition of  -2/3 + 3/5" should "return -1/15" in {
     Rational(-2,3).add(Rational(3,5)) should be (Rational(-1,15))
  }
  
  "Test 9:Rational addition of  0 + 3/5" should "return 3/5" in {
     Rational(0).add(Rational(3,5)) should be (Rational(3,5))
  }
  
  "Test 10:Rational addition of  1/2 - 3" should "return -5/2" in {
     Rational(1,2).add(Rational(-3)) should be (Rational(-5,2))
  }
}