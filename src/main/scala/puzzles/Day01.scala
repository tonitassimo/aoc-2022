package puzzles

import io.FileIO

object Day01 {
  def solveFirstPart(): Unit =
    val puzzle = getPuzzle()
    val lines = puzzle.split("\n\n")
    val groups = lines.map(group =>
      group
        .split("\n")
        .map(entry => entry.toInt)
    )
    val sums = groups.map(group => group.sum)
    val orderedSums = sums.sortBy(sum => -sum)
    // orderedSums.foreach(sum => println("sum: " + sum.toString()))
    val solution = orderedSums.head
    writeSolution(solution.toString())

  def solveSecondPart(): Unit =
    val puzzle = getPuzzle()
    val lines = puzzle.split("\n\n")
    val groups = lines.map(group =>
      group
        .split("\n")
        .map(entry => entry.toInt)
    )
    val sums = groups.map(group => group.sum)
    val orderedSums = sums.sortBy(sum => -sum)
    val sumOfFirstThreeElements = orderedSums.slice(0, 3).sum
    writeSolution(sumOfFirstThreeElements.toString())

  def getPuzzle(): String =
    FileIO.readResource("Day01.txt")

  def writeSolution(solution: String): Unit =
    FileIO.writeToStdOut(solution)
}
