package sort;

import java.util.Arrays;

/**
 * @Author : yion
 * @Date : 2017. 5. 23.
 * @Description : 삽입 정렬, 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함.
 * performance : O(n^2)
 * 첫 번째 실행 :
 * standard = 10, compare = 0, input[compare] = 9
 *
 * while loop break
 * input[1] = 10;
 *
 * 두번째 실행
 * standard = 2, compare = 1, input[compare] = 10
 *
 * while loop
 * input[2] = input[1] = 10
 *
 *
 * while loop
 * standard = 2, compare = 0, input[compare] = 9
 * input[1] = 9 break
 *
 * input[0] = 2
 *
 * ...
 *
 */
public class InsertionSort {
    public static void main(String[] args) {
        int [] input = {9, 10, 2, 6, 8};

        for (int i = 1; i < input.length; i++) {
            int standard = input[i]; // 기준값

            int compare = i - 1;    // 비교대상 (기준값의 왼쪽 요소를 비교)

            // 비교대상이 0보다 크고 기준값이 비교 대상보다 작을 경우 swap
            while (compare >= 0 && standard < input[compare]) {
                input[compare + 1] = input[compare];  // 비교 대상을 오른쪽으로 이동
                compare--;
            }

            input[compare + 1] = standard; // 기준값을 저장한다
        }

        System.out.print("result = ");
        System.out.println(Arrays.toString(input));
    }
}
