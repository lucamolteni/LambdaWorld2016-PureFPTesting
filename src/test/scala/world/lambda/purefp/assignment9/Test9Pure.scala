package world.lambda.purefp.assignment9

import org.specs2.concurrent.ExecutionEnv
import org.specs2.mutable.Specification

import scala.concurrent.Future

class Test9Pure extends Specification {

  "Pure test, do not use any mocks!" >> { implicit ee: ExecutionEnv =>

    // This is how you use futures and matchers together
    Future.successful(1).map(_ => success).await
  }

}
