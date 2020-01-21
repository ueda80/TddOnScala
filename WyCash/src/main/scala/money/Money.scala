package money

trait Money {

  protected var amount: Int = _
  protected var curr: String = ""

  def times(multiplier: Int): Money
  def currency(): String = {
    curr
  }

  override def equals(obj: Any): Boolean = {
    val money: Money = obj.asInstanceOf[Money]

    amount == money.amount &&
    getClass().equals(money.getClass())
  }
}

object Money {
  def dollar(amount: Int): Money = {
    new Dollar(amount, "USD")
  }

  def franc(amount: Int): Money = {
    new Franc(amount, "CHF")
  }
}
