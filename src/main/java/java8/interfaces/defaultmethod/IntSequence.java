package java8.interfaces.defaultmethod;

/**
 * @Author : yion
 * @Date : 2018. 5. 20.
 * @Description : IntSequence 를 구현하는 구현체는 여기에 있는 모든 메소드를 구현해야 하지만, default method 는 선별적으로 구현해줄 수 있다
 * 따라서 default 메소드를 선언하고 새로 구현하려고 하는 구현체에서 default 메소드를 재정의 해서 구현할 수 있고 기존에 있던 구현체들은 변경되는 내용이 없다
 */
public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    int next();


    public default void setChange(boolean isChange) {
        if (isChange) {
            System.out.println("IntSequence 상태 바꿈");
        } else {
            System.out.println("IntSequence 상태 안 바꿈!");
        }
    }

    public static IntSequence digistOf(int n) {

        return new DisitSequence(n);
    }

    public static void changePrint() {
        System.out.println("IntSequence print");
    }
}
