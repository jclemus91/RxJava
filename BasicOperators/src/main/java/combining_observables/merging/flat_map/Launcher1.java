package combining_observables.merging.flat_map;

import io.reactivex.Observable;

public class Launcher1 {

    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

        source.flatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);
    }

}
