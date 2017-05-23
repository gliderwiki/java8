package quiz;

/**
 * @Author : yion
 * @Date : 2017. 3. 23.
 * @Description :
 */
public class BinaryGap {

    public static void main(String[] args) {
        int x = 254;

        // decimal to binary
        String binaryString = Integer.toBinaryString(x);

        // decimal to hexadecimal
        String hexString = Integer.toHexString(x);

        // ASCII Code to String
        String charAscII = new Character((char) x).toString();

        System.out.println("binary : " + binaryString);
        System.out.println("hex : " + hexString);
        System.out.println("ASCII : " + charAscII);

    }
}
