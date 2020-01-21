package money

class Money(var amount: Int, val curr: String) {

  def times(multiplier: Int): Money = {
    new Money(amount * multiplier, curr)
  }

  def currency(): String = {
    curr
  }

  override def equals(obj: Any): Boolean = {
    val money: Money = obj.asInstanceOf[Money]

    amount == money.amount &&
    currency().equals(money.currency())
  }
}

object Money {
  def dollar(amount: Int): Money = {
    new Money(amount, "USD")
  }

  def franc(amount: Int): Money = {
    new Money(amount, "CHF")
  }
}
