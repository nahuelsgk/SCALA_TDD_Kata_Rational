package com.agilogy

case class Rational(numerador: Int, denominador:Int = 1) {
  
  def add(r: Rational) = {
    reduceRational(Rational(numerador*r.denominador+r.numerador*denominador, r.denominador*denominador))
  }
  
  def reduceRational(r: Rational ) = {
    var gcd_num = gcd(r.numerador, r.denominador)
    if (gcd_num < 0) gcd_num = gcd_num * -1 
    if (gcd_num==1) r
    else Rational(r.numerador/gcd_num, r.denominador/gcd_num)
  }
  
  def gcd(a: Int,b: Int): Int = {
    if(b == 0) a else gcd(b, a%b)
  } 
  

}
