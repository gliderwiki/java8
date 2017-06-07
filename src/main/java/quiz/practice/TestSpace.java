package quiz.practice;

/**
 * @Author : yion
 * @Date : 2017. 5. 31.
 * @Description :
 */
public class TestSpace {

    public static void main(String[] args) {
        String str = "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x";

        String[] arr = str.split("\\s");

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
