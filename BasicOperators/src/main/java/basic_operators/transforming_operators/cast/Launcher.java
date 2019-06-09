package basic_operators.transforming_operators.cast;

import io.reactivex.Observable;

public class Launcher {

    public static void main() {
        Observable<Object> items =
                Observable.just("Alpha", "Beta", "Gamma").cast(Object.class);

    }

}
