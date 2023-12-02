package factoryMethod.book.idcard

import factoryMethod.book.framework.Product
//　具体的な製品。具体的に肉付けをする。
class IdCard(private val owner: String): Product() {

    init {
        println("${owner}のカードを作ります!!")
    }
    override fun use(){
        println("${owner}のカードを使います!!")
    }
}