package templateMethod.book

fun main() {
    val chartDisplay: ChartDisplay = ChartDisplay("AAA")
    val stringDisplay: StringDisplay = StringDisplay("haaa")

    chartDisplay.display()
    stringDisplay.display()
}