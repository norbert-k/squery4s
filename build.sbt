name := "squery4s"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % "2.5.23",
  "com.lihaoyi" %% "fastparse" % "2.1.3",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)

logBuffered in Test := false