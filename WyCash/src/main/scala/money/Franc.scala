package money

class Franc(val a: Int, val c: String) extends Money() {
  amount = a
  curr = c

  def times(multiplier: Int): Money = {
    Money.franc(amount * multiplier)
  }
}
