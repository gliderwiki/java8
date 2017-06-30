package quiz;

import java.util.Scanner;

/**
 * @Author : yion
 * @Date : 2017. 6. 16.
 * @Description : AM, PM으로 입력 받은 시간을 24시간 포맷으로 변경하라.
 */
public class TimeConversion {

    static String timeConversion(String s) {
        // Complete this function
        String format = s.substring(s.length() - 2, s.length());

        System.out.println(format);


        if (format.equalsIgnoreCase("pm")) {
            int time = Integer.parseInt(s.substring(0, 2));
            if (s.substring(0, 2).equals("12")) {
                return "12"+ s.substring(2, s.length()-2);
            } else {
                return time + 12 + s.substring(2, s.length()-2);
            }
        } else {
            if (s.substring(0, 2).equals("12")) {
                return "00"+ s.substring(2, s.length()-2);
            } else {
                return s.substring(0, s.length() - 2);
            }

        }

    }

    public static void main(String[] args) {

        // 07:05:45PM -> 19:05:45

        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
