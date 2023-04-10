lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "edu.shekhar.fp",
      scalaVersion := "3.2.2"
    )),
    name := "scala functional programming"
  )

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.15"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"