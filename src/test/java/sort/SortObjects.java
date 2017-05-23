package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * @Author : yion
 * @Date : 2017. 5. 23.
 * @Description : String 클래스는 Comparable 인터페이스를 구현하므로 순서대로 정렬된다
 * 만약 정렬해야 하는 타입이 Comparable 인터페이스를 구현하지 않으면 ClassCastException 예외가 발생한다.
 */
public class SortObjects {

    @Test
    public void sortObjects() {
        final String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
        final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};

        Arrays.sort(strings);

        assertArrayEquals(expected, strings);
    }
}
