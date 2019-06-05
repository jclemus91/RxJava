package basic_operators.reducing_operators.contains;

import io.reactivex.Observable;

public class Launcher {

    public static void main(String[] args) {
        Observable.range(1, 10000)
                .contains(9999)
                .subscribe(s -> System.out.println("Received: " + s));
    }


}
