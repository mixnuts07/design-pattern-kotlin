package factoryMethod.book

import factoryMethod.book.idcard.IdCardFactory

fun main() {
    val factory = IdCardFactory()
    val card1 = factory.create("Yamamoto")
    val card2 = factory.create("Kazutake")
    val card3 = factory.create("Yama Kazu")
    card1.use()
    card2.use()
    card3.use()
}