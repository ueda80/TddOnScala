package money

class Franc(private var amount: Int) {
  def times(multiplier: Int): Franc = {
    new Franc(amount * multiplier)
  }

  override def equals(obj: Any): Boolean = {
    val franc: Franc = obj.asInstanceOf[Franc]
    amount == franc.amount
  }
}
