package basic_operators.suppressing_operators.take;

import io.reactivex.Observable;


public class Launcher {
    public static void main(String[] args) {

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .take(3)
                .subscribe(s -> System.out.println("RECEIVED: " + s));

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .takeLast(3)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
