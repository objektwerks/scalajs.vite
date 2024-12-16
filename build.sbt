enablePlugins(ScalaJSPlugin)

scalaVersion := "3.6.3-RC1"
libraryDependencies ++= {
  Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.8.0",
    "com.outr" %%% "scribe" % "3.15.2",
    "com.lihaoyi" %%% "utest" % "0.8.4" % Test
  )
}
scalacOptions ++= Seq(
  "-Wall"
)
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
testFrameworks += new TestFramework("utest.runner.Framework")
scalaJSUseMainModuleInitializer := true
