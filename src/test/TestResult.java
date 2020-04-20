package test;
import domain.Exercise;

/**
 * Тестовый класс для проверки функциональности
 * @author Odie
 */

public class TestResult {

    public static void main(String[] args) {

        int R=158635;
        if(R>=100000 && R<1000000)
            {
            System.out.println("Число "+R+" \r\n" + "в двоичной системе счисления: "+Exercise.CalculateBinarySystem(R)+"\nв восьмеричной системе счисления: "+Exercise.CalculateOctalSystem(R)+"\nв шестнадцатеричной системе счисления: "+Exercise.CalculateHexadecimalSystem(R));
            }
        else{
            System.out.println("Число R должно быть шестизначным!");
            }
    }
}