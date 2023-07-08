import org.scalajs.linker.interface.ModuleSplitStyle

enablePlugins(ScalaJSPlugin)

lazy val public = "public"

scalaVersion := "3.3.1-RC3"
libraryDependencies ++= {
  Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.4.0",
    "com.outr" %%% "scribe" % "3.11.1",
    "com.lihaoyi" %%% "utest" % "0.8.1" % Test
  )
}
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
testFrameworks += new TestFramework("utest.runner.Framework")

scalaJSUseMainModuleInitializer := true
/* This does not work in any configuration!
scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.ESModule)
    .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("objektwerks")))
} */
Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public
