package wtf.scala.e01

object FizzBuzz {
  /**
    * Return "fizz", "buzz", "fizzbuzz" or number between 0 (inclusive) and n (exclusive).
    * For a given natural number greater than zero return:
    * "fizzbuzz" if the number is dividable by 3 and 5
    * "buzz" if the number is dividable by 5
    * "fizz" if the number is dividable by 3
    * the same number if no other requirement is fulfilled
    *
    * @param n
    * @throws IllegalArgumentException if n < 1
    * @return seq of fizzbuzz strings
    */
  @throws[IllegalArgumentException]
  private[e01] def fizzBuzzUntil(n: Int): Seq[String] = {
    require(n > 0, "������ ���� �������������")

    def devideThree(number: Int) = {
      if (number % 3 == 0) "fizz"
      else ""
    }
    def devideFive(number: Int) = {
      if (number % 5 == 0) "buzz"
      else ""
    }
    var answer = devideThree(n) + devideFive(n)
    if(answer == "") Array(n.toString)
    else
    Array(devideThree(n), devideFive(n))
  }

  def main(args: Array[String]): Unit = {
    println(fizzBuzzUntil(100).mkString(" "))
  }
}