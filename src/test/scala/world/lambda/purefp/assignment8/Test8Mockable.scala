package world.lambda.purefp.assignment8

import java.util.logging.Logger

import org.specs2.mock.Mockito
import org.specs2.mutable.Specification

import scala.concurrent.Future


class Test8Mockable extends Specification with Mockito {

  "Let's try using mocks interacting with the real world using Futures" >> {


    // Mockito syntax for stubbing
    // mock.callHttpService(anyString) returns Future.successful("Ok")

    success
  }
}
