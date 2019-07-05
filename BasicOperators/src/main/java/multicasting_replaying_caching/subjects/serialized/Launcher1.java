package multicasting_replaying_caching.subjects.serialized;

import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class Launcher1 {

    public static void main(String[] args) {
        Subject<String> subject =
                PublishSubject.<String>create().toSerialized();

    }

}
