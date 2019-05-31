package Error;

import io.reactivex.Observable;

public class Launcher {
    private static int start = 1;
    private static int count = 5;

    public static void main(String[] args) {
        Observable.error(new Exception("Crash and burn!"))
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        Throwable::printStackTrace,
                        () -> System.out.println("Done!"));
    }

}

