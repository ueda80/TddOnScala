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
    assert(Money.franc(5).equals(Money.franc(5)) == true)
    assert(Money.franc(5).equals(Money.franc(6)) == false)
    assert(Money.franc(5).equals(Money.dollar(5)) == false)
  }

  test("testFrancMultiplication()") {
    val five: Money = Money.franc(5)
    assert(Money.franc(10).equals(five.times(2)) == true)
    assert(Money.franc(15).equals(five.times(3)) == true)
  }

  test("testCurrency()") {
    assert("USD" == Money.dollar(1).currency())
    assert("CHF" == Money.franc(1).currency())
  }
}
