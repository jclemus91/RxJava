package suppressing_operators.skip_while;

import io.reactivex.Observable;


public class Launcher {
    public static void main(String[] args) {
        Observable.range(1, 100)
                .skipWhile(i -> i <= 95)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
