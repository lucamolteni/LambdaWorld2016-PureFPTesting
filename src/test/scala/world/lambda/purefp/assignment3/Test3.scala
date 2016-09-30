package world.lambda.purefp.assignment3

import org.specs2.mutable.Specification

class Test3 extends Specification {

  "This test is non deterministic, try run it by yourself" >> {

    // Try writing one that is deterministic

    val cafe = new UntestableCafe()

    val coffee = cafe.buyCoffee(new CreditCard())

    success("hopefully charged")
  }
}
