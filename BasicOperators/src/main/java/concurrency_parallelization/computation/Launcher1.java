package concurrency_parallelization.computation;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Launcher1 {
    /**
     * A number of operators and factories will use the computation Scheduler by default unless you specify a different one as an argument. These include one or more overloads for interval(), delay(), timer(), timeout(), buffer(), take(), skip(), takeWhile(), skipWhile(), window(), and a few others.
     */
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .subscribeOn(Schedulers.computation());

    }

}
