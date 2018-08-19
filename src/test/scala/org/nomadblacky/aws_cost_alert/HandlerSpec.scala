package org.nomadblacky.aws_cost_alert

import com.amazonaws.services.lambda.runtime.{Context, LambdaLogger}
import org.mockito.Mockito._
import org.scalatest.mockito.MockitoSugar
import org.scalatest.{FunSpec, Matchers}

class HandlerSpec extends FunSpec with Matchers with MockitoSugar {
  describe("#handleRequest") {
    it("""should return a response that has a message of "OK"""") {
      val handler = new Handler
      val contextMock = {
        val m = mock[Context]
        when(m.getLogger) thenReturn new EmptyLogger
        m
      }
      val result = handler.handleRequest(Request("https://hoge.foo", "@nomadblacky"), contextMock)
      result shouldBe Response("OK")
    }
  }
}

class EmptyLogger extends LambdaLogger {
  override def log(message: String): Unit      = ()
  override def log(message: Array[Byte]): Unit = ()
}
