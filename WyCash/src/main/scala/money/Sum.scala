package money

class Sum(val augend: Expression, val addend: Expression) extends Expression {
  override def plus(addend: Expression): Expression = {
    new Sum(this, addend)
  }

  override def reduce(bank: Bank, to: String): Money = {
    val amount: Int = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
    new Money(amount, to)
  }

  override def times(multiplier: Int): Expression = {
    new Sum(augend.times(multiplier), addend.times(multiplier))
  }
}
