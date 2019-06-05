package basic_operators.Callable;

import io.reactivex.Observable;

public class Launcher {
    private static int start = 1;
    private static int count = 5;

    public static void main(String[] args) {
        Observable.fromCallable(() -> 1 / 0)
                .subscribe(i -> System.out.println("Received: " + i),
                        e -> System.out.println("Error Captured: " + e));
    }

}

