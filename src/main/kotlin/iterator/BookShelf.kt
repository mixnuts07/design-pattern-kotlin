package iterator

class BookShelf(private val maxsize: Int): Iterable<Book> {
    val books: Array<Book> = arrayOf(Book())
    val last: Int = 0
    override fun iterator(): Iterator<Book> {
        TODO("Not yet implemented")
    }

}