package basic_operators.suppressing_operators.distinct_until_change;

import io.reactivex.Observable;


public class Launcher {
    public static void main(String[] args) {
        Observable.just(1, 1, 1, 2, 7, 3, 3, 2, 1, 1)
                .distinctUntilChanged()
                .subscribe(i -> System.out.println("RECEIVED: " + i));

        Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma",
                "Delta")
                .distinctUntilChanged(i -> i.length())
                .subscribe(i -> System.out.println("RECEIVED: " + i));


    }

}
