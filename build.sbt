import org.scalajs.linker.interface.ModuleSplitStyle

lazy val public = "public"

lazy val scalajsvite = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    scalaVersion := "3.2.2",
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(
          ModuleSplitStyle.SmallModulesFor(List("objektwerks")))
    },
    libraryDependencies ++= {
      Seq(
        "org.scala-js" %%% "scalajs-dom" % "2.4.0",
        "com.outr" %%% "scribe" % "3.11.1",
        "com.lihaoyi" %%% "utest" % "0.8.1" % Test
      )
    },
    jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv(),
    testFrameworks += new TestFramework("utest.runner.Framework"),
    Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public,
    Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public
  )