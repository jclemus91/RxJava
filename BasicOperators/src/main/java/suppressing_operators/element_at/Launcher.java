package suppressing_operators.element_at;

import io.reactivex.Observable;


public class Launcher {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma",
                "Delta")
                .elementAt(13)
                .defaultIfEmpty("empty default")
                .subscribe(i -> System.out.println("RECEIVED: " + i));

        Observable.empty()
                .firstElement()
                .defaultIfEmpty("empty")
                .subscribe(i -> System.out.println("RECEIVED: " + i));

        Observable.empty()
                .firstOrError()
                .subscribe(i -> System.out.println("RECEIVED: " + i), i-> i.printStackTrace());

        Observable.empty()
                .elementAtOrError(199)
                .subscribe(i -> System.out.println("RECEIVED: " + i), i-> i.printStackTrace());


    }

}
