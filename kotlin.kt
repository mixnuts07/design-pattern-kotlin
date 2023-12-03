// companion object ... クラス内に生成されるSingletonのこと。
// classの代わりにobjectを使用するとSingletonが作成できる。
// クラス内では、objectの前にcompanion修飾子を付与することでクラスに所属するSigletonが作成できる。これをcompanion objectと呼ぶ。
// Javaのstaticの代わりに用いる。
// objectは1つのインスタンスだけを提供し、companion objectはクラスに静的メンバ（メソッドやプロパティ）を追加する。
// 静的メンバ...クラスに属するが特定のインスタンスには属さないフィールドやメソッド。つまりオブジェクトが存在しなくても呼び出すことができる。ユーティリティ関数や定数など、インスタンス固有の状態を持たないデータに適している。
object Singleton {
    fun show() {
        println("This is a singleton object.")
    }
}
Singleton.show()
class MyClass {
    companion object {
        fun show() {
            println("This is a comanion object")
        }
    }
}
MyClass.show()