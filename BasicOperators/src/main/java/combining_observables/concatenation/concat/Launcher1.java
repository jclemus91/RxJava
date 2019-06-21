package combining_observables.concatenation.concat;

import io.reactivex.Observable;

public class Launcher1 {

    public static void main(String[] args) {
        Observable<String> source1 = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        Observable<String> source2 = Observable.just("Zeta", "Eta", "Theta");

        Observable
                .concat(source1, source2)
                .subscribe(i -> System.out.println("RECEIVED: " + i));

        source1.concatWith(source2)
                .startWith("---concatWith----")
                .subscribe(i -> System.out.println("RECEIVED: " + i));

    }

}
