package factoryMethod.book.idcard

import factoryMethod.book.framework.Factory
import factoryMethod.book.framework.Product

// 具体的な製品を作るクラスを定める。
class IdCardFactory: Factory() {
    override fun createProduct(owner: String): Product {
        return IdCard(owner)
    }

    override fun registerProduct(product: Product) {
        println("${product}をDBに登録しました")
    }
}