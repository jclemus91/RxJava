import io.reactivex.Observable

fun main() {
    val source: Observable<String> = Observable.create {
        try {
            it.onNext("Alpha")
            it.onNext("Beta")
            it.onNext("Gamma")
            it.onNext("Delta")
            it.onNext("Epsilon")
            it.onComplete()
        } catch (e: Throwable) {
            it.onError(e)
        }
    }

    source.map {
        it.length
    }.filter {
        it >= 5
    }.subscribe {
        println("received: $it")
    }
}

fun main2() {
    val source: Observable<String> = Observable.create {
        try {
            it.onNext("Alpha")
            it.onNext("Beta")
            it.onNext("Gamma")
            it.onNext("Delta")
            it.onNext("Epsilon")
            it.onComplete()
        } catch (e: Throwable) {
            it.onError(e)
        }
    }

    val lengths: Observable<Int> = source.map { it.length }
    val filtered: Observable<Int> = lengths.filter { it >= 5 }

    filtered.subscribe {
        println("filtered: $it, ")
    }
    source.subscribe {
        println("source: $it, ")
    }
    lengths.subscribe {
        println("lenghts: $it")
    }
}