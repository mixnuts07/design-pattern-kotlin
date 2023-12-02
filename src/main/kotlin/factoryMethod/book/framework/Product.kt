package factoryMethod.book.framework

// Factory Methodによって生成されるインスタンスが持つべきInterfaceを定義する
abstract class Product {
    open fun use() {}
}