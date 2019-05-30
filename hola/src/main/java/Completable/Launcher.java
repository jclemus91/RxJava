package Completable;

import io.reactivex.Completable;

public class Launcher {
    public static void main(String[] args) {
        Completable.fromRunnable(() -> runProcess())
                .subscribe(() -> System.out.println("Done!"));
    }

    public static void runProcess() {
        //run process here
    }
}