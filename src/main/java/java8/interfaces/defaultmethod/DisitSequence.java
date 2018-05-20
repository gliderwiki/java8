package java8.interfaces.defaultmethod;

/**
 * @Author : yion
 * @Date : 2018. 5. 20.
 * @Description :
 */
public class DisitSequence implements IntSequence {
    public DisitSequence(int n) {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {
        return 0;
    }

    public static void main(String[] args) {
        IntSequence.changePrint();
    }
}
