package transforming_operators.sorted;

import io.reactivex.Observable;

import java.util.Comparator;

public class Launcher {

    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .sorted(Comparator.reverseOrder())
                .subscribe(System.out::println);

        Observable.just("Alpha", "Beta", "Gamma" ,"Delta", "Epsilon")
                .sorted((x,y) -> Integer.compare(x.length(), y.length()))
                .subscribe(System.out::println);

    }


}
