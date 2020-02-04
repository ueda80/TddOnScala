package money

class Sum(val augend: Money, val addend: Money) extends Expression {
  override def reduce(bank: Bank, to: String): Money = {
    val amount: Int = augend.amount + addend.amount
    new Money(amount, to)
  }
}
