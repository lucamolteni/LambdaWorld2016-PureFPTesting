package world.lambda.purefp.assignment2

import org.specs2.mutable.Specification

class Test2 extends Specification {

  "Can the addition be non-deterministic?" in {

    // Write the implementation of Calculator in order to make this test pass

    val calculator = new Calculator()

    calculator.sum(2, 3) === 5

    calculator.sum(2, 3) === 10

  }
}
