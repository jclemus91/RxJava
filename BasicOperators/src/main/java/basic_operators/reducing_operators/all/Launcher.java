package basic_operators.reducing_operators.all;

import io.reactivex.Observable;

public class Launcher {

    public static void main(String[] args) {
        Observable.just(5, 3, 7, 11, 2, 14)
                .all(i -> i < 100)
                .subscribe(s -> System.out.println("Received: " + s));
    }

}
