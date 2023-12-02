package factoryMethod.book.framework

abstract class Factory {
    public fun create(owner: String): Product {
        val product = createProduct(owner)
        registerProduct(product)
        return product
    }
    abstract fun createProduct(owner: String): Product
    abstract fun registerProduct(product: Product)
}
