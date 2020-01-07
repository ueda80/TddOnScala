package money

class Money() {

  protected var amount: Int = _

  override def equals(obj: Any): Boolean = {
    val money: Money = obj.asInstanceOf[Money]

    amount == money.amount &&
    getClass().equals(money.getClass())
  }
}
