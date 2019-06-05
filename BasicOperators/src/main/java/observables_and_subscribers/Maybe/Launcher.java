package observables_and_subscribers.Maybe;

import io.reactivex.Maybe;
public class Launcher {
    public static void main(String[] args) {
        // has emission
        Maybe<Integer> presentSource = Maybe.just(100);
        presentSource.subscribe(s -> System.out.println("Process 1 received: " + s),
        Throwable::printStackTrace,
                () -> System.out.println("Process 1 done!"));

        //no emission
        Maybe<Integer> emptySource = Maybe.empty();
        emptySource.subscribe(s -> System.out.println("Process 2 received: " + s),
        Throwable::printStackTrace,
                () -> System.out.println("Process 2 done!"));
    }
}

/**
 * A given Maybe<T> will only emit 0 or  1 emissions. It will pass the possible emission to onSuccess(), and in either case, it will call onComplete() when done. Maybe.just() can be used to create a Maybe emitting the single item. Maybe.empty() will create a Maybe that yields no emission:
 *
 * Nield, Thomas. Learning RxJava: Reactive, Concurrent, and responsive applications . Packt Publishing. Kindle Edition.
 */