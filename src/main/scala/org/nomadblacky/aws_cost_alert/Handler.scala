package org.nomadblacky.aws_cost_alert

import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}

import scala.beans.BeanProperty

class Handler extends RequestHandler[Request, Response] {
  override def handleRequest(input: Request, context: Context): Response = {
    context.getLogger.log(s"Receive a request: $input")
    Response("OK")
  }
}

case class Request(
    @BeanProperty var webhookUrl: String,
    @BeanProperty var channel: String
)

case class Response(
    @BeanProperty var message: String
)
