package money

class Dollar(val a: Int) extends Money() {
  amount = a

  def times(multiplier: Int): Dollar = {
    new Dollar(amount * multiplier)
  }

}
