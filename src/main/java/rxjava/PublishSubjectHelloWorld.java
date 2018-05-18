package rxjava;

import rx.Observer;
import rx.Subscription;
import rx.subjects.PublishSubject;

public class PublishSubjectHelloWorld {
    public static void main(String[] args) {
        PublishSubject<String> stringPublishSubject = PublishSubject.create();

        Subscription subscriptionPrint = stringPublishSubject.subscribe(new Observer<String>() {
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

        stringPublishSubject.onNext("Hello World");
    }
}
