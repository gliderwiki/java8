package algorithm;

import java.util.Arrays;

/**
 * @Author : yion
 * @Date : 2017. 5. 23.
 * @Description : 구성 요소를 순회하면서 인접한 요소간의 값을 비교하여 정렬.
 * Performance : 비효율적이다. 최악의 경우 역순으로 정렬하려고 할 때 O(n^2)가 나오고 최선은 리스트가 이미 정렬이 되어있을 경우 O(N)의 서ㅇ능이 나온다.
 *
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        final int[] numbers = {4, 7, 1, 2, 5, 8, 6};

        printBubbleSort(numbers);
    }

    private static void printBubbleSort(int[] numbers) {
        boolean switched;

        do {
            switched = false;

            for (int i = 0; i < numbers.length -1; i++) {
                // 첫번째 원소와 현재 원소를 비교해서 현재 원소보다 작으면 swap
                if (numbers[i + 1] < numbers[i]) {
                    int temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    switched = true;
                }
            }

        } while (switched);

        System.out.println("Result = " + Arrays.toString(numbers));
    }
}
