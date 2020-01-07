package money

class Franc(val a: Int) extends Money() {
  amount = a

  def times(multiplier: Int): Franc = {
    new Franc(amount * multiplier)
  }
}
