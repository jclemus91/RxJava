package combining_observables.merging.flat_map;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Launcher4 {

    public static void main(String[] args) {
        Observable<Integer> secondIntervals = Observable.just(2, 0, 3, 10, 7);
        secondIntervals.flatMap(i -> {
            if (i == 0) {
                return Observable.empty();
            } else {
                return Observable.interval(i, TimeUnit.SECONDS)
                        .map(l -> i + "s interval: " + ((l + 1) * i) + " seconds elapsed");
            }
        }).subscribe(System.out::println);

        sleep(12000);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
