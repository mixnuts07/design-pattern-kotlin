package builder.book

class Director(private val builder: Builder){
    private val arrCommon: Array<String> = arrayOf("How Are you", "Hello.", "Hi.")
    private val arrTime: Array<String> = arrayOf("Good morning.", "Good Afternoon", "Good Evening.")

    fun construct() {
        builder.makeTitle("Greeting")
        builder.makeString("一般的な挨拶")
        builder.makeItems(arrCommon)
        builder.makeString("時間帯に応じた挨拶")
        builder.makeItems(arrTime)
        builder.close()
    }
}