package basic_operators.transforming_operators.repeat;

import io.reactivex.Observable;

public class Launcher {

    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma" ,"Delta", "Epsilon")
                .repeat(2)
                .startWith("-------")
                .subscribe(s -> System.out.println("Received: " + s));
    }

}
