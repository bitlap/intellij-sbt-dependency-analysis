ThisBuild / resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://s01.oss.sonatype.org/content/repositories/snapshots",
  "Sonatype OSS Releases" at "https://s01.oss.sonatype.org/content/repositories/releases"
)
addSbtPlugin("org.jetbrains" % "sbt-ide-settings"  % "1.1.0")
addSbtPlugin("org.jetbrains" % "sbt-idea-plugin"   % "4.0.2")
addSbtPlugin("org.scalameta" % "sbt-scalafmt"      % "2.5.4")
addSbtPlugin("org.bitlap"    % "sbt-kotlin-plugin" % "4.0.0")
