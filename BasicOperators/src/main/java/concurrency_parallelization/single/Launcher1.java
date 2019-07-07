package concurrency_parallelization.single;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Launcher1 {
    /**
     * When you want to run tasks sequentially on a single thread, you can invoke Schedulers.single(). This is backed by a single-threaded implementation appropriate for event looping.
     */
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .subscribeOn(Schedulers.single());

    }

}
