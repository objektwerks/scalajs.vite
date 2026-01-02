enablePlugins(ScalaJSPlugin)

scalaVersion := "3.8.0-RC4"
libraryDependencies ++= {
  Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.8.1",
    "com.outr" %%% "scribe" % "3.17.0",
    "com.lihaoyi" %%% "utest" % "0.9.2" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
testFrameworks += new TestFramework("utest.runner.Framework")
scalaJSUseMainModuleInitializer := true
