package combining_observables.zipping;

import io.reactivex.Observable;

public class Launcher1 {

    public static void main(String[] args) {
        Observable<String> source1 =
                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        Observable<Integer> source2 = Observable.range(1, 6);

        Observable.zip(source1, source2, (s, i) -> s + "-" + i)
                .subscribe(System.out::println);

    }

}
