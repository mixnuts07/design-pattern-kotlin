package templateMethod.book

public abstract class AbstractDisplay {
    abstract fun open()
    abstract fun print()
    abstract fun close()

    // template method
    fun display() {
        open()
        for (i in 0..5) {
            print()
        }
        close()
    }
}