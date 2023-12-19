package builder.book

import java.io.FileWriter
import java.io.IOException

class HTMLBuilder: Builder() {
    private var fileName = "untitled.html"
    private val sb = StringBuilder()
    override fun makeTitle(title: String) {
        fileName = title + ".html"
        sb.append("<!DOCTYPE html>\n")
        sb.append("<html>\n")
        sb.append("<head><title>")
        sb.append(title)
        sb.append("</title></head>\n")
        sb.append("<body>\n")
        sb.append("<h1>")
        sb.append(title)
        sb.append("</h1>\n\n")
    }
    override fun makeString(string: String) {
        sb.append("<p>")
        sb.append(string)
        sb.append("</p>\n\n")
    }
    override fun makeItems(items: Array<String>) {
        sb.append("<ul>")
        items.forEach {
            sb.append("<li>")
            sb.append(it)
            sb.append("</li>")
        }
    }
    override fun close() {
        sb.append("</body>")
        sb.append("</html>\n")
        try {
            val writer = FileWriter(fileName)
            writer.write(sb.toString())
            writer.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
    fun getHTMLResult(): String {
        return fileName
    }
}