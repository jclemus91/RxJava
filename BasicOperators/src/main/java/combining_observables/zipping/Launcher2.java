package combining_observables.zipping;

import io.reactivex.Observable;

public class Launcher2 {

    public static void main(String[] args) {
        Observable<String> source1 =
                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        Observable<Integer> source2 = Observable.range(1, 6);

        source1
                .zipWith(source2, (s, i) -> s + "-" + i)
                .subscribe(System.out::println);

    }

}
