/**
 * Created by pskrebnev on 05.03.2015.
 */

import java.util.NoSuchElementException

object InitialTask extends App {

  /**
   * This method computes the sum of all elements in the list xs.
   *
   * For this example assignment you can use the following methods in class
   * `List`:
   *
   * - `xs.isEmpty: Boolean` returns `true` if the list `xs` is empty
   * - `xs.head: Int` returns the head element of the list `xs`. If the list
   * is empty an exception is thrown
   * - `xs.tail: List[Int]` returns the tail of the list `xs`, i.e. the the
   * list `xs` without its `head` element
   *
   * ''Hint:'' instead of writing a `for` or `while` loop, think of a recursive
   * solution.
   *
   * @param xs A list of natural numbers
   * @return The sum of all elements in `xs`
   */
  def sum(xs: List[Int]): Int = {
    if (xs.nonEmpty) {
      var s = 0
      xs.foreach(n => s += n)
      s
    } else {
      throw new NoSuchElementException("There are no elements in List")
    }
  }

  /**
   * This method returns the largest element in a list of integers. If the
   * list `xs` is empty it throws a `java.util.NoSuchElementException`.
   *
   * You can use the same methods of the class `List` as mentioned above.
   *
   * ''Hint:'' Again, think of a recursive solution instead of using looping
   * constructs. You might need to define an auxiliary method.
   *
   * @param xs A list of natural numbers
   * @return The largest element in `xs`
   * @throws java.util.NoSuchElementException if `xs` is an empty list
   */
  def max(xs: List[Int]): Int = {
    if (xs.nonEmpty) {
      var xma = 0
      xs.foreach(n => if (n > xma) xma = n else n)
      xma
    } else {
      throw new scala.NoSuchElementException("There are no elements in List")
    }
  }

  val ds = List(10, 1, 2, 3, 4, 5, 6, 10, 8)
//    val ds = List()

  println("The sum of all elements is " + sum(ds))
  println("The max element in List is " + max(ds))

}






