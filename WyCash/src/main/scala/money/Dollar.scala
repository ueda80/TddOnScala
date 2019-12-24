package money

class Dollar(private var amount: Int) {
  def times(multiplier: Int): Dollar = {
    new Dollar(amount * multiplier)
  }

  override def equals(obj: Any): Boolean = {
    val dollar: Dollar = obj.asInstanceOf[Dollar]
    amount == dollar.amount
  }
}
