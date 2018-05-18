package rxjava;

import rx.Observable;
import rx.Observer;
import rx.Subscription;

public class ObservableHelloWorld {
    public static void main(String[] args) {
        Observable<String> observableString = Observable.just(helloWorld());

        Subscription subscriptionPrint =  observableString.subscribe(new Observer<String>() {

            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Observable Error");
            }

            @Override
            public void onNext(String s) {
                System.out.println("result = " + s);
            }
        });
    }

    private static String helloWorld() {
        return "Hello Rx World";
    }
}
