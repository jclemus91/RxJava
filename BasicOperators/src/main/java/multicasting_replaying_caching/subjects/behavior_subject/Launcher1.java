package multicasting_replaying_caching.subjects.behavior_subject;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;

public class Launcher1 {

    public static void main(String[] args) {
        Subject<String> subject = BehaviorSubject.create();
        subject.subscribe(s -> System.out.println("Observer 1: " + s));
        subject.onNext("Alpha");
        subject.onNext("Beta");
        subject.onNext("Gamma");
        subject.subscribe(s -> System.out.println("Observer 2: " + s));
    }
}
