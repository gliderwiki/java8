package quiz;
/**
 * @Author : yion
 * @Date : 2017. 3. 23.
 * @Description :
 */
class TextInput {
    static String textInput = "";
    public void add(char c) {
        textInput += c;
    }


    public String getValue() {
        return textInput;
    }
}

class NumericInput extends TextInput {
    static String numberInput = "";

    @Override
    public void add(char c) {
        if (Character.isDigit(c)){
            numberInput += c;
        }
    }

    @Override
    public String getValue() {
        return numberInput;
    }
}

public class UserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}