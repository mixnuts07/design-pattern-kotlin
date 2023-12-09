package templateMethod.book

class StringDisplay(private val str: String): AbstractDisplay() {
    private val width = str.length
    override fun open() {
        printLine()
    }

    override fun print() {
        println("| $str |")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for (i in 0..width) {
            print("-")
        }
        println("+")
    }
}