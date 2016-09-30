package world.lambda.purefp.assignment1

import org.specs2.mutable.Specification

class Test1 extends Specification {

  "Write the implementation of Calculator in order to make this test pass" in {

    val calculator = new Calculator()

    calculator.sum(2, 3) === 5

  }
}
