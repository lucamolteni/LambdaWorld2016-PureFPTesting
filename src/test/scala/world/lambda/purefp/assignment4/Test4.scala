package world.lambda.purefp.assignment4

import org.specs2.mock.Mockito
import org.specs2.mutable.Specification

class Test4 extends Specification with Mockito {


  "This is the traditional OOP way, you can test this using Mockito" >> {

    val cafe = new TestableCafe()

    // Create a mock with mock[Interface]

    val cc = CreditCard()

    val coffee = cafe.buyCoffee(cc, ???)

    // there was one(???).charge(???, ???)

    success
  }
}
