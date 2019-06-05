package reducing_operators.any;

import io.reactivex.Observable;

import java.time.LocalDate;

public class Launcher {

    public static void main(String[] args) {
        Observable.just("2016-01-01", "2016-05-02", "2016-09-12",
                "2016-04-03")
                .map(i -> LocalDate.parse(i))
                .any(dt -> dt.getMonthValue() >= 6)
                .subscribe(s -> System.out.println("Received: " + s));
    }


}
