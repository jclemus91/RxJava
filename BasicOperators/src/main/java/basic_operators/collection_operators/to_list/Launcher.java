package basic_operators.collection_operators.to_list;

import io.reactivex.Observable;

import java.util.concurrent.CopyOnWriteArrayList;

public class Launcher {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .toList()
                .subscribe(s -> System.out.println("Received: " + s));

        Observable.range(1,1000)
                .toList(1000)
                .subscribe(s -> System.out.println("Received: " + s));

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .toList(CopyOnWriteArrayList::new)
                .subscribe(s -> System.out.println("Received: " + s));


    }

}
