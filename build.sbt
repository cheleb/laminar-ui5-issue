import scala.sys.process.Process

ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "3.2.1"

enablePlugins(ScalaJSPlugin)
libraryDependencies ++= List(
  // web framework (other choices are slinky, scala-js-react, outwatch...)
  "com.raquo" %%% "laminar" % "0.14.5",
  // web component library (other (non-exclusive) choices are material-ui, bootstrap...)
  "be.doeraene" %%% "web-components-ui5" % "1.8.1"
)
scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.ESModule)
}
scalaJSUseMainModuleInitializer := true
