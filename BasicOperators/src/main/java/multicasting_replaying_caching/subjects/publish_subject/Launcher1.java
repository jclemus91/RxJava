package multicasting_replaying_caching.subjects.publish_subject;

import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class Launcher1 {

    public static void main(String[] args) {
        Subject<String> subject = PublishSubject.create();
        subject.map(String::length)
                .subscribe(System.out::println);
        subject.onNext("Alpha");
        subject.onNext("Beta");
        subject.onNext("Gamma");
        subject.onComplete();
    }

}
