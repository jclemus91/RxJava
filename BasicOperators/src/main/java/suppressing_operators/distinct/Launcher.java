package suppressing_operators.distinct;

import io.reactivex.Observable;


public class Launcher {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .map(String::length)
                .distinct()
                .subscribe(i -> System.out.println("RECEIVED: " + i));

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .distinct(i -> i.length())
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }

}
