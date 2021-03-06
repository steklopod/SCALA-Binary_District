package wtf.scala.e12

import org.scalameter.{Bench, Gen}

/**
  * This benchmark is intended to compare three median calculation algorithms performance
  * using ScalaMeter micro-benchmarking framework.
  *
  * In this example you'll need to
  *
  *  1. implement random integer number arrays generation of sizes generated by the
  *  [[wtf.scala.e12.ScalaMeter#sizes]] generator
  *  2. measure the three available Median calculation algorithms running time
  *
  *  Make sure the generated arrays are randomized order-wise (i.e., not sorted).
  *
  *  Try to make sense of the measurements readings, check if the results comply to the algorithms
  *  theoretical time complexity described in the [[wtf.scala.e12.Median]]'s scala-doc.
  *
  *  @see [[wtf.scala.e12.Median]] for algorithms details
  */
object ScalaMeter extends Bench.LocalTime {

  val sizes: Gen[Int] = Gen.range("size")(30000, 600000, 30000)
  val arrays: Gen[Array[Int]] = ???

  performance of "Median" in {
    // Measure the 'sortingMedian'
    ???

    // Measure the 'kMedian'
    ???

    // Measure the 'medianOfMedians'
    ???
  }

}
