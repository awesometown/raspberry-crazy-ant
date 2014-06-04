import play.Project._

name := "CodingChallengeJava"

version := "1.0"

resolvers += Resolver.url("Objectify Play Repository", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("Objectify Play Snapshot Repository", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns)

libraryDependencies ++= Seq(
	"org.webjars" %% "webjars-play" % "2.2.1-2",
	"org.webjars" % "bootstrap" % "3.1.0",
	"be.objectify" %% "deadbolt-java" % "2.2-RC2",
	"com.google.inject" % "guice" % "3.0",
	"ma.glasnost.orika" % "orika-core" % "1.4.2",
	"org.testng" % "testng" % "6.1.1"
)

playJavaSettings