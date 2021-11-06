package lab11;

public class ExceptionTest{
    public static void main(String[] args) {
        try {
            throw new ExceptionB("Exception B");
        } catch (ExceptionA e) {
            e.printStackTrace();
        }

        try {
            throw new ExceptionC("Exception C");
        } catch (ExceptionA e) {
            e.printStackTrace();
        }
    }

}