package io

import scala.io.Source

class FileIO {
  def readResource(resource: String): String =
    Source.fromResource(resource).mkString

  def writeToStdOut(output: String): Unit =
    println(output)
}
