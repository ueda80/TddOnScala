package money

class Money(var amount: Int, val curr: String) extends Expression{

  override def times(multiplier: Int): Expression = {
    new Money(amount * multiplier, curr)
  }

  override def plus(addend: Expression): Expression = {
    new Sum(this, addend)
  }

  override def reduce(bank: Bank, to: String): Money = {
    val rate: Int = bank.rate(curr, to)
    new Money(amount / rate, to)
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

object Mo
ney {
  def dollar(amount: Int): Money = {
    new Money(amount, "USD")
  }

  def franc(amount: Int): Money = {
    new Money(amount, "CHF")
  }
}
