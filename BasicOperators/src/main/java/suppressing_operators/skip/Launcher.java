package suppressing_operators.skip;

import io.reactivex.Observable;


public class Launcher {
    public static void main(String[] args) {
        Observable.range(1, 100)
                .skip(90)
                .subscribe(i -> System.out.println("RECEIVED: " + i));


        Observable.range(1, 100)
                .skipLast(90)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}