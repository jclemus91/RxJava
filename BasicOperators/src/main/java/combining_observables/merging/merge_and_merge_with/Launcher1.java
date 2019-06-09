package combining_observables.merging.merge_and_merge_with;

import io.reactivex.Observable;

public class Launcher1 {

    public static void main(String[] args) {
        Observable<String> source1 = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        Observable<String> source2 = Observable.just("Zeta", "Eta", "Theta");

        Observable
                .merge(source1, source2)
                .subscribe(i -> System.out.println("RECEIVED: " + i));

        //Alternative
        source1.mergeWith(source2)
                .startWith("----Alternative----")
                .subscribe(i -> System.out.println("RECEIVED: " + i));

    }


}
