package basic_operators.reducing_operators.reduce;

import io.reactivex.Observable;

public class Launcher {

    public static void main(String[] args) {
        Observable.just(5, 3, 7, 10, 2, 14)
                .reduce((total, next) -> total + next)
                .subscribe(s -> System.out.println("Received: " + s));
    }

}
