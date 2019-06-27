package multicasting_replaying_caching.autoconnect;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Launcher3 {

    public static void main(String[] args) {
        Observable<Long> seconds =
                Observable.interval(1, TimeUnit.SECONDS)
                        .publish()
                        .autoConnect();
        //Observer 1
        seconds.subscribe(i -> System.out.println("Observer 1: " + i));
        sleep(3000);
        //Observer 2
        seconds.subscribe(i -> System.out.println("Observer 2: " + i));
        sleep(3000);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
