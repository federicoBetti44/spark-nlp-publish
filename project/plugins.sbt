val scoverageVersion = "1.6.0"

resolvers += "bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven/"

addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.6")

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.1")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

/** scoverage */
addSbtPlugin("org.scoverage" % "sbt-scoverage" % scoverageVersion)

/** Publish to git */
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.12")
//addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.3.1")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")