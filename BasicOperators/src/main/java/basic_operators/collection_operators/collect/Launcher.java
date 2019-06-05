package basic_operators.collection_operators.collect;

import io.reactivex.Observable;

import java.util.HashSet;

public class Launcher {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .collect(HashSet::new, HashSet::add)
                .subscribe(s -> System.out.println("Received: " + s));

    }

}
