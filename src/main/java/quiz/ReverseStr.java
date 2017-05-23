package quiz;

import java.util.Arrays;

/**
 * @Author : yion
 * @Date : 2017. 3. 23.
 * @Description :
 */
public class ReverseStr {
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println(rs.reverseStr("Zbcdefg"));
    }

    private String reverseStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return new StringBuilder(new String(chars)).reverse().toString();
    }
}
