package concurrency_parallelization.io;

public class Launcher1 {
    /**
     * IO tasks such as reading and writing databases, web requests, and disk storage are less expensive on the CPU and often have idle time waiting for the data to be sent or come back.
     */
    public static void main(String[] args) {
        /*Database db = Database.from("conn");
        Observable<String> customerNames =
                db.select("SELECT NAME FROM CUSTOMER");
                        db.getAs(String.class);
                //        .subscribeOn(Schedulers.io());
*/
    }


    //FAKE DB
    private static class Database {

        public Database() {
        }

        static Database from(String conn) {
            return new Database();
        }

        static Database select(String queryFake) {
            return new Database();
        }

        static Database getAs(Class clazz) {
            return new Database();
        }
    }
}
