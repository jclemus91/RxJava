package reducing_operators.count;

import io.reactivex.Observable;

public class Launcher {

    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .count()
                .subscribe(s -> System.out.println("Received: " + s));
    }

}
