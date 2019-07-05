package multicasting_replaying_caching.replaying;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Launcher4 {

    public static void main(String[] args) {
        Observable<Long> seconds =
                Observable.interval(300, TimeUnit.MILLISECONDS)
                        .map(l -> (l + 1) * 300) // map to elapsed milliseconds
                        .replay(1, TimeUnit.SECONDS)
                        .autoConnect();
        //Observer 1
        seconds.subscribe(l -> System.out.println("Observer 1: " + l));
        sleep(2000);
        //Observer 2
        seconds.subscribe(l -> System.out.println("Observer 2: " + l));
        sleep(1000);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
