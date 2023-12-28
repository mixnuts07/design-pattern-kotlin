package singleton.book

import java.time.LocalTime

object Singleton {
        private val localTime = LocalTime.now()

        fun write() {
                println("write...")
        }
        fun read() {
                println("now is $localTime")
        }
}
