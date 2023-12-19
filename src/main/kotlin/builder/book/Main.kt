package builder.book

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
       usage()
       exitProcess(1)
    }
    if(args[0] == "text") {
        val textBuilder = TextBuilder()
        val director = Director(textBuilder)
        director.construct()
        val result = textBuilder.getTextResult()
        println(result)
    } else if (args[0] == "html") {
        val htmlBuilder = HTMLBuilder()
        val director = Director(htmlBuilder)
        director.construct()
        val fileName = htmlBuilder.getHTMLResult()
        println("HTMLファイル" + fileName + "が作成されました")
    } else {
        usage()
        exitProcess(0)
    }
}

fun usage() {
    println("Usage: arg = text でテキスト作成")
    println("Usage: arg = html でHTML作成")
}
