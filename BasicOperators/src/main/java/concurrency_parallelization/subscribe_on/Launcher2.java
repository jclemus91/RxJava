package concurrency_parallelization.subscribe_on;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.ThreadLocalRandom;

public class Launcher2 {

    public static void main(String[] args) {
        Observable<Integer> lengths =
                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                        .subscribeOn(Schedulers.computation())
                        .map(Launcher2::intenseCalculation)
                        .map(String::length);
        lengths.subscribe(i ->
                System.out.println("Received: " + i + " on thread " +
                        Thread.currentThread().getName()));
        lengths.subscribe(i ->
                System.out.println("Received- " + i + " on thread " +
                        Thread.currentThread().getName()));
        sleep(10000);
    }

    public static <T> T intenseCalculation(T value) {
        sleep(ThreadLocalRandom.current().nextInt(3000));
        return value;
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

