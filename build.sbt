lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.nomadblacky",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "aws-cost-alert",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % Test,
      "org.mockito" %% "mockito-scala" % "0.2.0" % Test,
      "com.amazonaws" % "aws-lambda-java-events" % "2.1.0",
      "com.amazonaws" % "aws-lambda-java-core"   % "1.2.0"
    )
  )
