package observables_and_subscribers.Single;

import io.reactivex.Observable;

public class Launcher {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");
        source.last("Nil") //returns a Single
                .subscribe(System.out::println);
    }
}


/**
 * Single<T> is essentially an Observable<T> that will only emit one item. It works just like an Observable, but it is limited only to operators that make sense for a single emission. It has its own SingleObserver interface as well:
 *
 * Nield, Thomas. Learning RxJava: Reactive, Concurrent, and responsive applications . Packt Publishing. Kindle Edition.
 */
