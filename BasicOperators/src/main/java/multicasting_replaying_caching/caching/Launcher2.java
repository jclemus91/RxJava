package multicasting_replaying_caching.caching;

import io.reactivex.Observable;

public class Launcher2 {

    public static void main(String[] args) {
        Observable<Integer> cachedRollingTotals =
                Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                        .scan(0, (total, next) -> total + next)
                        .cacheWithInitialCapacity(9);
        cachedRollingTotals.subscribe(System.out::println);
    }

}
