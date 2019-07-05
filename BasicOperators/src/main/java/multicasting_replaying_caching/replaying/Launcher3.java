package multicasting_replaying_caching.replaying;

import io.reactivex.Observable;

public class Launcher3 {

    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma",
                        "Delta", "Epsilon")
                        .replay(1)
                        .refCount();
        //Observer 1
        source.subscribe(l -> System.out.println("Observer 1: " + l)); //Observer 2
        source.subscribe(l -> System.out.println("Observer 2: " + l));
    }

}
