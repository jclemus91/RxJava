import io.reactivex.Observable

fun main() {
    val source: Observable<String> = Observable.create {
        it.onNext("Alpha")
        it.onNext("Beta")
        it.onNext("Gamma")
        it.onNext("Delta")
        it.onNext("Epsilon")
        it.onComplete()
    }
    source.subscribe{
        println("Received: $it")
    }
}