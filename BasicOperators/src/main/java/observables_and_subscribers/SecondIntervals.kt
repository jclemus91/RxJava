import io.reactivex.Observable
import java.util.concurrent.TimeUnit

fun main() {
    val secondIntervals: Observable<Long> = Observable.interval(1, TimeUnit.SECONDS)
    secondIntervals.subscribe {
        println(it)
    }
    secondIntervals
            .delay(2, TimeUnit.SECONDS)
            .subscribe {
        println("- $it")
    }
    sleep(6500)
}


fun sleep(millis: Long) {
    try {
        Thread.sleep(millis)
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }
}