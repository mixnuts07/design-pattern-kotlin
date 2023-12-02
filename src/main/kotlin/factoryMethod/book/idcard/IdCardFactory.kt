package factoryMethod.book.idcard

import factoryMethod.book.framework.Factory
import factoryMethod.book.framework.Product

class IdCardFactory: Factory() {
    override fun createProduct(owner: String): Product {
        return IdCard(owner)
    }

    override fun registerProduct(product: Product) {
        println("${product}をDBに登録しました")
    }
}