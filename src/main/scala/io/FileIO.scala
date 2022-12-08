package io

import scala.io.Source

object FileIO {
  def readResource(resource: String): String =
    Source.fromResource(resource).mkString

  def writeToStdOut(output: String): Unit =
    println(output)
}
