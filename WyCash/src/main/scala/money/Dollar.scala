package money

class Dollar(val a: Int, val c: String) extends Money() {
  amount = a
  curr = c

  def times(multiplier: Int): Money = {
    Money.dollar(amount * multiplier)
  }
}
