package concurrency_parallelization.subscribe_on;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Launcher1 {

    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .subscribeOn(Schedulers.trampoline());

    }

}
