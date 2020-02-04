package money

import scala.collection.mutable

class Bank {
  private var rates: mutable.HashMap[Pair, Int] = mutable.HashMap.empty[Pair, Int]

  def reduce(source: Expression, to: String): Money = {
    source.reduce(this, to)
  }

  def addRate(from: String, to: String, rate: Int): Unit = {
    rates.put(new Pair(from, to), rate)
  }

  def rate(from: String, to: String): Int = {
    if (from.equals(to)) {
      return 1
    }
    rates.getOrElse(new Pair(from, to), 1)
  }
}
