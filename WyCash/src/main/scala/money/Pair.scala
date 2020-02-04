package money

class Pair(private val from: String, private val to: String) {
  override def equals(any: Any): Boolean = {
    val pair: Pair = any.asInstanceOf[Pair]
    from.equals(pair.from) && to.equals(pair.to)
  }

  override def hashCode(): Int = {
    0
  }
}
