package collection_operators.to_multimap;

import io.reactivex.Observable;

public class Launcher {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .toMultimap(s -> s.length())
                .subscribe(s -> System.out.println("Received: " + s));

    }


}
