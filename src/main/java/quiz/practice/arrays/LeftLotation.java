package quiz.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author : yion
 * @Date : 2017. 5. 29.
 * @Description :
 */
public class LeftLotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) { // array, array 사이즈, 쉬프트 갯수
        //System.out.println("# n = " + n);
        //System.out.println("# k = " + k);
        int start = 0;

        while (start < k) {  // k 만큼 돌면서 위치를 바꿔준다.
            int std = a[0];
            for (int i = 0; i < a.length -1 ; i++) {
                a[i] = a[i + 1];
            }

            a[a.length - 1] = std;

            start++;
        }

        System.out.println("result = " + Arrays.toString(a));
        return a;
    }

    // 5 4
    // 1 2 3 4 5

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();       // 5 (1,2,3,4,5)
        int k = in.nextInt();       // 2
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            System.out.println("a_i = " + a[a_i]);
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }

}
