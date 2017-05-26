package algorithm.sort;

import java.util.Arrays;

/**
 * @Author : yion
 * @Date : 2017. 5. 23.
 * @Description : 따로 메모리를 사용하지 않는다. 현재 있는 메모리 안에서 정렬하기 때문에 효율이 좋음
 * 피봇을 하나 정해 피봇보다 작은 아이템은 왼쪽에 큰 것은 오른쪽에 위치하고 왼쪽 아이템, 오른쪽 아이템을 각각 quick sort로 리컬시브하게 연산한다.
 * performance : O(n log n), worst case O(n^2) : 이미 정렬된 상태에서 실행할 경우
 * space complexity : O(n)
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 3, 7, 10};

        int low = 0;
        int high = array.length -1;

        quickSort(array, low, high);

        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0 || array == null) {
            return;
        }

        if (low >= high) {
            return;
        }

        // 피봇을 정한다.
        int middle = low + (high - low) / 2;
        int pivot = array[middle];


        // 왼쪽은 피봇보다 작고 오른쪽은 피봇보다 커야 한다.
        int i = low;
        int j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j++;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }

        if (low > i) {
            quickSort(array, i, high);
        }

    }
}
