name := """rpg-mon-catalog"""
organization := "com.justin"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  jdbc,
  guice,
  "org.postgresql" % "postgresql" % "42.2.12",
)
