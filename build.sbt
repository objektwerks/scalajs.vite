import org.scalajs.linker.interface.ModuleSplitStyle

enablePlugins(ScalaJSPlugin)

lazy val public = "public"

scalaVersion := "3.2.2"
scalaJSUseMainModuleInitializer := true
libraryDependencies ++= {
  Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.4.0",
    "com.outr" %%% "scribe" % "3.11.1",
    "com.lihaoyi" %%% "utest" % "0.8.1" % Test
  )
}
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
testFrameworks += new TestFramework("utest.runner.Framework")
scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.ESModule)
}
Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public