package domain;

/**
 * �������� ����� ��� ������ � �������
 * @author Odie
 */
public class Exercise {

    /**
     * �����, ������� ��������� ���������� ����� � ��������
     * @param R ����� ����� 
     * @return ��������� ����� � ����������������� ������ 
     */
    public static String CalculateBinarySystem(int R){
        return (String) (Integer.toBinaryString((int) R));
    }
    
    /**
     * �����, ������� ��������� ���������� ����� � ������������
     * @param R ����� ����� � ���������, ������� ����� ���������
     *  @return ��������� ����� � ����������������� ������ 
     */
    public static String CalculateOctalSystem(int R){
        return (String) (Integer.toOctalString((int) R));
    }
    
    /**
     * �����, ������� ��������� ���������� ����� � �����������������
     * @param R ����� �����
     *  @return ��������� ����� � ����������������� ������ 
     */
    public static String CalculateHexadecimalSystem(int R){
        return (String) (Integer.toHexString((int) R));
    }
}