package builder.book

class TextBuilder: Builder() {
    // StringBuilderは、可変な文字列を扱うためのクラス。
    // Stringと異なり、StringBuilderの内容は変更可能で、文字列の追加、削除、変更などが効率的に行える。
    private val sb = StringBuilder()
    override fun makeTitle(title: String) {
        sb.append("==========\n")
        sb.append("[")
        sb.append(title)
        sb.append("]\n\n")
    }

    override fun makeString(string: String) {
        sb.append("■")
        sb.append(string)
        sb.append("\n\n")
    }

    override fun makeItems(items: Array<String>) {
        items.forEach {
            sb.append(" ・")
            sb.append(it)
            sb.append("\n")
        }
    }

    override fun close() {
        sb.append("==========\n")
    }

    public fun getTextResult(): String {
        return sb.toString()
    }
}