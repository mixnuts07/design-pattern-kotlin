package builder.book

abstract class Builder {
    abstract fun makeTitle(title: String)
    abstract fun makeString(string: String)
    abstract fun makeItems(items: Array<String>)
    abstract fun close()
}