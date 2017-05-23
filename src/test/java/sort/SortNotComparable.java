package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.fail;

/**
 * @Author : yion
 * @Date : 2017. 5. 23.
 * @Description : 정렬해야 할 타입이 Comparable을 구현하지 않으면 예외가 발생한다.
 */
public class SortNotComparable {
    @Test
    public void sortNotComparable() {
        final List<NotComparable> objects = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            objects.add(new NotComparable(i));
        }

        try {
            Arrays.sort(objects.toArray());
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

        fail();

    }

    private class NotComparable {

        public NotComparable(int i) {

        }
    }
}
