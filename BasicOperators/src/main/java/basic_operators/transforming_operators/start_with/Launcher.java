package basic_operators.transforming_operators.start_with;

import io.reactivex.Observable;

public class Launcher {

    public static void main(String[] args) {
        Observable<String> menu =
                Observable.just("Coffee", "Tea", "Espresso", "Latte");
        //print menu
        menu.startWithArray("COFFEE SHOP MENU", "----------------")
                .subscribe(System.out::println);
    }

}
