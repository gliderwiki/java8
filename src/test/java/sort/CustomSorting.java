package sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Author : yion
 * @Date : 2017. 5. 23.
 * @Description :
 */
public class CustomSorting {

    @Test
    public void customSorrting() {
        final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
        final List<Integer> expexted = Arrays.asList(7,6,5,4,4,3,1);

        Collections.sort(numbers, new ReverseNumericalOrder());

        assertEquals(expexted, numbers);
    }

    private class ReverseNumericalOrder implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
}
