package combining_observables.merging.merge_and_merge_with;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class Launcher3 {

    public static void main(String[] args) {
        Observable<String> source1 = Observable.just("Alpha", "Beta");
        Observable<String> source2 = Observable.just("Gamma", "Delta");
        Observable<String> source3 = Observable.just("Epsilon", "Zeta");
        Observable<String> source4 = Observable.just("Eta", "Theta");
        Observable<String> source5 = Observable.just("Iota", "Kappa");

        List<Observable<String>> sources = Arrays.asList(source1, source2, source3, source4, source5);

        Observable
                .merge(sources)
                .subscribe(i -> System.out.println("RECEIVED: " + i));

    }

}
