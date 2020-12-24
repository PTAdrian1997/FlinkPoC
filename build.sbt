name := "FlinkPoC"

version := "0.1"

scalaVersion := "2.12.12"

idePackagePrefix := Some("mp.y2.sem1.bda.flinkpoc")

// https://mvnrepository.com/artifact/org.apache.flink/flink-core
libraryDependencies += "org.apache.flink" % "flink-core" % "1.12.0"

// https://mvnrepository.com/artifact/org.apache.flink/flink-streaming-scala
libraryDependencies += "org.apache.flink" %% "flink-streaming-scala" % "1.12.0"

// https://mvnrepository.com/artifact/org.apache.flink/flink-clients
libraryDependencies += "org.apache.flink" %% "flink-clients" % "1.12.0"
