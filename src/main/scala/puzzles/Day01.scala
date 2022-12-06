package puzzles

import io.FileIO

def solve(): Unit =
    val puzzle = getPuzzle()
    writeSolution(puzzle)

def getPuzzle(): String =
    FileIO().readResource("Day01.txt")

def writeSolution(solution: String): Unit =
    FileIO().writeToStdOut(solution)
