package quiz.practice.day1;

import java.util.Scanner;

/**
 * @Author : yion
 * @Date : 2017. 5. 29.
 * @Description :
 */
public class DataType {


    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int intNum = 0;
        double dblNum = 0;
        String str = "";


        /* Read and save an integer, double, and String to your variables.*/
        intNum = scan.nextInt();
        dblNum = scan.nextDouble();
        while(scan.hasNext()){
            str = scan.nextLine();
        }
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + intNum);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + dblNum);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + str);
    }

}
