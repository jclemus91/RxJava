package concurrency_parallelization.trampoline;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Launcher1 {
    /**
     * it prevents cases of recursive scheduling where a task schedules a task while on the same thread. Instead of causing a stack overflow error, it will allow the current task to finish and then execute that new scheduled task afterward.
     */
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .subscribeOn(Schedulers.trampoline());

    }

}
