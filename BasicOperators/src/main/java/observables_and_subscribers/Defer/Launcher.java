package observables_and_subscribers.Defer;

import io.reactivex.Observable;

public class Launcher {
    private static int start = 1;
    private static int count = 5;

    public static void main(String[] args) {
        //NO DEFER
        //Observable<Integer> source = Observable.range(start,count);

        //DEFER
        Observable<Integer> source = Observable.defer(() -> Observable.range(start, count));

        source.subscribe(i -> System.out.println("Observer 1: " + i));
        //modify count
        count = 10;
        source.subscribe(i -> System.out.println("Observer 2: " + i));
    }
}

