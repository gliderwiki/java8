package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * @Author : yion
 * @Date : 2017. 5. 23.
 * @Description : int 타입 배열 정렬
 */

public class SortInts {

    @Test
    public void sortInts() {
        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] exprected = {-5, -3, -2, 1, 4, 7};

        Arrays.sort(numbers);

        assertArrayEquals(exprected, numbers);
    }


}
