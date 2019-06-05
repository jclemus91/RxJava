import io.reactivex.Observable

fun main() {
    val myStrings: Observable<String> = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
    myStrings
            .doOnTerminate {
                println("do Onterminate")
            }

            .doOnNext {
                println("doOnnext: $it")
            }
            .doOnComplete {
                println("doOncomplet")
            }
            .map {
                it.length
            }
            .map {
                it.plus(it).equals(10)
            }
            .subscribe {
                println(it)
            }
}

