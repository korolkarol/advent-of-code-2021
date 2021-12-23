import java.io.File

fun main(args: Array<String>) {
    val answer = InputFile().file?.useLines {
        it.map { s -> s.toLong() }
            .slidingWindowSums()
            .countIncreases()
    }

    println("Day 2 answer: " + answer)
}

class InputFile(private val fileName: String = "day-1-input.txt") {

    val file: File?
        get() = javaClass.getResource(fileName)?.file?.let {
            File(it)
        }

}
