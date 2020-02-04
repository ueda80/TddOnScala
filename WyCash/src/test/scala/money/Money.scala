package money

import org.scalatest.FunSuite

class WyCash extends FunSuite {
  test("testMultiplication()") {
    val five: Money = Money.dollar(5)
    assert(Money.dollar(10).equals(five.times(2)) == true)
    assert(Money.dollar(15).equals(five.times(3)) == true)

  }

  test("testEquality()") {
    assert(Money.dollar(5).equals(Money.dollar(5)) == true)
    assert(Money.dollar(5).equals(Money.dollar(6)) == false)
    assert(Money.franc(5).equals(Money.dollar(5)) == false)
  }

  test("testCurrency()") {
    assert("USD" == Money.dollar(1).currency())
    assert("CHF" == Money.franc(1).currency())
  }

  test("testSimpleAddition()") {
    val five: Money = Money.dollar(5)
    val sum: Expression = five.plus(five)
    val bank: Bank = new Bank()
    val reduced: Money = bank.reduce(sum, "USD")
    assert(Money.dollar(10) == reduced)
  }

  test("testPlusReturnsSum()") {
    val five: Money = Money.dollar(5)
    val result: Expression = five.plus(five)
    val sum: Sum = result.asInstanceOf[Sum]
    assert(five == sum.augend)
    assert(five == sum.addend)
  }

  test("testReduceSum()") {
    val sum: Expression = new Sum(Money.dollar(3), Money.dollar(4))
    val bank: Bank = new Bank()
    val result: Money = bank.reduce(sum, "USD")
    assert(Money.dollar(7) == result)
  }

  test("testReduceMoney()") {
    val bank: Bank = new Bank();
    val result: Money = bank.reduce(Money.dollar(1), "USD")
    assert(Money.dollar(1) == result)
  }

  test("testReduceMoneyDifferentCurrency()") {
    val bank: Bank = new Bank()
    bank.addRate("CHF", "USD", 2)
    val result: Money = bank.reduce(Money.franc(2), "USD")
    assert(Money.dollar(1) == result)
  }

  test("testIdentityRate()") {
    assert(1 == new Bank().rate("USD", "USD"))
  }
}
