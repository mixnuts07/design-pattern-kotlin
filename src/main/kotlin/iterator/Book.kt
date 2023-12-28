package iterator

class Book() {
    private var name: String = ""
    fun book(name: String) {
        name.also { this.name = it }
    }
    fun getName(): String {
        return this.name
    }

}