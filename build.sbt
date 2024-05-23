import Dependencies.*

lazy val root = (project in file("."))
  .enablePlugins(GitVersioning, GatlingPlugin)
  .settings(
    name         := "gatling-jdbc-plugin",
    scalaVersion := "2.13.14",
    libraryDependencies ++= gatling ++ gatlingCore,
    libraryDependencies ++= Seq(hikari, h2jdbc),
    scalacOptions ++= Seq(
      "-encoding",
      "UTF-8",            // Option and arguments on same line
      "-Xfatal-warnings", // New lines for each options
      "-deprecation",
      "-feature",
      "-unchecked",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:existentials",
      "-language:postfixOps",
    ),
  )
