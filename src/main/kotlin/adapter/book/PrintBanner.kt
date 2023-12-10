package adapter.book

class PrintBanner(str: String) : Banner(str), Print {
    override fun printWeek() {
        super.showWithParen()
    }

    override fun printStrong() {
        super.showWithAster()
    }
}