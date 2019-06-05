package transforming_operators.scan;

import io.reactivex.Observable;

public class Launcher {

    public static void main(String[] args) {
        Observable.just(5, 3, 7, 10, 2, 14)
                .scan((accumulator, next) -> accumulator + next)
                .subscribe(s -> System.out.println("Received: " + s));

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .scan(0, (total, next) -> total + 1)
                .startWith(-9999)
                .skip(2)
                .subscribe(s -> System.out.println("Received: " + s));
    }


}
