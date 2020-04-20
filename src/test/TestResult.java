package test;
import domain.Exercise;

/**
 * Functional test class
 * @author Odie
 */

public class TestResult {

    public static void main(String[] args) {

        int R=158635;
        if(R>=100000 && R<1000000)
            {
            System.out.println("Number "+R+" \r\n" + "\r\n" + "in binary notation: "+Exercise.CalculateBinarySystem(R)+"\n\r\n" + "in octal number system: "+Exercise.CalculateOctalSystem(R)+"\n\r\n" + "in hexadecimal notation: "+Exercise.CalculateHexadecimalSystem(R));
            }
        else{
            System.out.println("The number R must be six digits!");
            }
    }
}