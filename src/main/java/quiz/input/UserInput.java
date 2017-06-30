package quiz.input;

/**
 * @Author : yion
 * @Date : 2017. 5. 28.
 * @Description :
 */
public class UserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('a');
        input.add('b');
        input.add('z');
        input.add('z');
        System.out.println(input.getValue());
    }
}