package algorithm.sort;

import java.util.Arrays;

/**
 * @Author : yion
 * @Date : 2017. 5. 23.
 * @Description : 병합정렬 (Divide & Conquer)
 * 주워진 배열을 두 부분씩 나누워 정렬한 후 하나로 합치는 방식
 * 두 번의 재귀 호출과 한 번의 합병으로 구성되며 재귀 호출 시 배열 크기가 절반으로 줄어 들어
 * 깊이가  log n 으로 된다. 즉, 두 배열의 합은 두 배열의 크기의 합에 비례 함으로
 * 전체 수행 시간 복잡도는 최악, 최선, 평균 모두 O(n log n).
 * 분할정복 방식의 알고리즘의 한 종류 (1/2 씩 분할)
 * 안정적인 정렬
 * Performance : O(n log n)
 * http://www.vogella.com/tutorials/JavaAlgorithmsMergesort/article.html
 */
public class MergeSort {

    public static void main(String[] args) {
        final Integer[] numbers = {6, 5, 3, 1, 8, 7, 2, 4};
        mergeSort(numbers);
        System.out.println("Result = " + Arrays.toString(numbers));
    }

    private static void mergeSort(Integer[] numbers) {
        Integer[] temp = new Integer[numbers.length];
        mergeOperator(numbers, temp, 0, numbers.length - 1);
    }

    private static void mergeOperator(Integer[] numbers, Integer[] temp, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;        // 가운데 분할
            mergeOperator(numbers, temp, left, middle);         // 첫번째 부터 중간 요소까지
            mergeOperator(numbers, temp, middle + 1, right);    // 중간 요소 다음부터 끝 요소 까지
            merge(numbers, temp, left, middle + 1, right);      // 병합
        }
    }

    private static void merge(Integer[] numbers, Integer[] temp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd) {
            if (numbers[left].compareTo(numbers[right]) <= 0) {
                temp[k++] = numbers[left++];
            } else {
                temp[k++] = numbers[right++];
            }
        }

        while (left <= leftEnd) { // copy rest of first half
            temp[k++] = numbers[left++];
        }

        while (right <= rightEnd) { // copy rest of right half
            temp[k++] = numbers[right++];
        }

        // copy temp back
        for (int i = 0; i < num; i++, rightEnd--) {
            numbers[rightEnd] = temp[rightEnd];
        }
    }


}
