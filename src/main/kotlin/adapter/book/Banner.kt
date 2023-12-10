package adapter.book

open class Banner(private val str: String) {
    fun showWithParen() {
        println("( $str )")
    }

    fun showWithAster() {
        println("* $str *")
    }
}