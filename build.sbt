enablePlugins(ScalaJSPlugin)

scalaVersion := "3.7.4-RC3"
libraryDependencies ++= {
  Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.8.1",
    "com.outr" %%% "scribe" % "3.17.0",
    "com.lihaoyi" %%% "utest" % "0.9.1" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
testFrameworks += new TestFramework("utest.runner.Framework")
scalaJSUseMainModuleInitializer := true
