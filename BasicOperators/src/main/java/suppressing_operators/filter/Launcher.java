package suppressing_operators.filter;

import io.reactivex.Observable;


public class Launcher {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .filter(s -> s.length() != 5)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
