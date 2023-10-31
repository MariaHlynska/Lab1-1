import static org.junit.Assert.*;
public class Main {
    public static void main(String[] args)
    {
        int x = 2;
        int expectedValue = 5;
        int actualValue = calculatePow3(x);
        assertEquals(expectedValue,actualValue);
    }

    public static int calculatePow3 (int x){
        return (int) Math.pow(x,3);
    }
}
