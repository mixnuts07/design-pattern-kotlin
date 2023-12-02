package factoryMethod.book.idcard

import factoryMethod.book.framework.Product

class IdCard(private val owner: String): Product() {

    init {
        println("${owner}のカードを作ります!!")
    }
    override fun use(){
        println("${owner}のカードを使います!!")
    }
}