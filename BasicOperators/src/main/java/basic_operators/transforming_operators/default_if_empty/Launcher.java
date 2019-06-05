package basic_operators.transforming_operators.default_if_empty;

import io.reactivex.Observable;

public class Launcher {

    public static void main(String[] args) {
        Observable<String> items = Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");

        items.filter(s -> s.startsWith("Z"))
                .defaultIfEmpty("None")
                .subscribe(System.out::println);
    }

}
