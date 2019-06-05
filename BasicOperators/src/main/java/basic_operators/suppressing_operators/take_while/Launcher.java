package basic_operators.suppressing_operators.take_while;

import io.reactivex.Observable;


public class Launcher {
    public static void main(String[] args) {
        Observable.range(1, 100)
                .takeWhile(i -> i < 5)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
