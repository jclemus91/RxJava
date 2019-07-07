package concurrency_parallelization.new_thread;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Launcher1 {
    /**
     * This may be helpful in cases where you want to create, use, and then destroy a thread immediately so it does not take up memory. But for complex applications generally, you will want to use Schedulers.io() so there is some attempt to reuse threads if possible.  You also have to be careful as  Schedulers.newThread() can run amok in complex applications (as can Schedulers.io()) and create a high volume of threads, which could crash your application.
     */
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .subscribeOn(Schedulers.newThread());

    }

}
