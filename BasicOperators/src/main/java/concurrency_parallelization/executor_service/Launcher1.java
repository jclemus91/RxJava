package concurrency_parallelization.executor_service;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Launcher1 {
    /**
     * You may choose to do this in order to have more custom and fine-tuned control over your thread management policies.
     */
    public static void main(String[] args) {
        int numberOfThreads = 20;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        Scheduler scheduler = Schedulers.from(executor);
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .subscribeOn(scheduler)
                .doFinally(executor::shutdown)
                .subscribe(System.out::println);
    }

}
