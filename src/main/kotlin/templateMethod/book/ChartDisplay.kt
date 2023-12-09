package templateMethod.book

class ChartDisplay(private val ch: String): AbstractDisplay() {

    override fun open() {
        println("<<")
    }

    override fun print() {
        println(ch)
    }

    override fun close() {
        println(">>")
    }

}