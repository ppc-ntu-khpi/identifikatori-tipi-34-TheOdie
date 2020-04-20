package domain;

/**
 * Основной класс для работы с числами
 * @author Odie
 */
public class Exercise {

    /**
     * Метод, который переводит десятичное число в двоичное
     * @param R целое число 
     * @return указанное число в шестнадцатеричной записи 
     */
    public static String CalculateBinarySystem(int R){
        return (String) (Integer.toBinaryString((int) R));
    }
    
    /**
     * Метод, который переводит десятичное число в восьмеричное
     * @param R целое число с действием, которое будет выполнено
     *  @return указанное число в шестнадцатеричной записи 
     */
    public static String CalculateOctalSystem(int R){
        return (String) (Integer.toOctalString((int) R));
    }
    
    /**
     * Метод, который переводит десятичное число в шестнадцатеричное
     * @param R целое число
     *  @return указанное число в шестнадцатеричной записи 
     */
    public static String CalculateHexadecimalSystem(int R){
        return (String) (Integer.toHexString((int) R));
    }
}