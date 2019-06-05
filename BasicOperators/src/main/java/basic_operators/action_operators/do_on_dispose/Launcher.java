package basic_operators.action_operators.do_on_dispose;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class Launcher {

    public static void main(String[] args) {
        Disposable disposable = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .doOnSubscribe(d -> System.out.println("Subscribing!"))
                .doOnDispose(() -> System.out.println("Disposing!"))
                .doFinally(() -> System.out.println("Finally!"))
                .subscribe(i -> System.out.println("RECEIVED: " + i));
        disposable.dispose();
    }

}
