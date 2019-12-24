package money

import org.scalatest.FunSuite

class Money extends FunSuite {
  test("testMultiplication()") {
    val five: Franc = new Franc(5)
    assert(new Franc(10).equals(five.times(2)) == true)
    assert(new Franc(15).equals(five.times(3)) == true)

  }

  test("testEquality()") {
    assert(new Franc(5).equals(new Franc(5)) == true)
    assert(new Franc(5).equals(new Franc(6)) == false)
  }

  test("testFrancMultiplication()") {
    val five: Franc = new Franc(5)
    assert(new Franc(10).equals(five.times(2)) == true)
    assert(new Franc(15).equals(five.times(3)) == true)
  }
}
