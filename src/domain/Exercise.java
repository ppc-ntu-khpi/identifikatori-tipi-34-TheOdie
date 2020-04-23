package domain;

/**
 * Main class
 * @author Odie
 */
public class Exercise {

    /**
     * Method converts decimal to binary
     * @param R integer 
     * @return specified hexadecimal value 
     */
    public static String CalculateBinarySystem(int R){
        return (String) (Integer.toBinaryString((int) R));
    }
    
    /**
     * Method converts decimal to binary
     * @param R integer
     *  @return specified hexadecimal value 
     */
    public static String CalculateOctalSystem(int R){
        return (String) (Integer.toOctalString((int) R));
    }
    
    /**
     * Method converts decimal to binary
     * @param R integer
     *  @return specified hexadecimal value 
     */
    public static String CalculateHexadecimalSystem(int R){
        return (String) (Integer.toHexString((int) R));
    }
    public static String Calculate(int R) {
    return "in binary notation: "+CalculateBinarySystem(R)+"\n\r\n" + "in octal number system: "+CalculateOctalSystem(R)+"\n\r\n" + "in hexadecimal notation: "+CalculateHexadecimalSystem(R);
    }
}