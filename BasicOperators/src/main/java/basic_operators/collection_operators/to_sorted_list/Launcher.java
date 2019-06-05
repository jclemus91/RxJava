package basic_operators.collection_operators.to_sorted_list;

import io.reactivex.Observable;

public class Launcher {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .toSortedList()
                .subscribe(s -> System.out.println("Received: " + s));
    }

}
