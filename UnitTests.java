/**
 * Unit Tests - checking to see if MiniCalculator works by testing the methods for multiplying, dividing, and calculating
 * work appropriately.
 * CS 108-2
 * @date 4/18/2020
 * @author Maria Paula Molina
 */

public class UnitTests {
    public static void main (String[] args) {

        multiplyTest();
        divideTest();
        calculateTest();

    }

    public static void multiplyTest() {

        MiniCalculator testValMultiply = new MiniCalculator();
        testValMultiply.total = 5;

        testValMultiply.multiply(3);
        if (testValMultiply.total != 15) {
            System.out.println("FAILED to multiply total by 3.");
        } else {
            System.out.println("SUCCESS! Multiplied total by 3.");
        }

        testValMultiply.multiply(2);
        if (testValMultiply.total != 30) {
            System.out.println("FAILED to store previous total value.");
        } else {
            System.out.println("SUCCESS! Updated total value after previous calculation. ");
        }
    }

    public static void divideTest() {

        MiniCalculator testValDivide = new MiniCalculator();

        testValDivide.total = 15;

        testValDivide.divide(5);
        if (testValDivide.total != 3) {
            System.out.println("FAILED to divide 15 by 5 ");
        }
        else {
            System.out.println("SUCCESS! Divided total by 5.");
        }

        try {
            testValDivide.divide(0);
        }
        catch (ArithmeticException excpt){
            System.out.println("Caught ArithmeticException: " + excpt.getMessage());
        }

    }

    public static void calculateTest() {
        MiniCalculator testValCalc = new MiniCalculator();

        testValCalc.total = 5;

        testValCalc.multiply(5);
        if (testValCalc.calculate() != 25){
            System.out.println("FAILED to utilize calculate method in order to multiply");
        }
        else {
            System.out.println("SUCCESSFULLY calculated a multiplication using abstract method.");
        }

        testValCalc.divide(5);
        if (testValCalc.calculate() != 5) {
            System.out.println("FAILED to utilize calculate method in order to divide.");
        }
        else {
            System.out.println("SUCCESSFULLY calculated a division using abstract method.");
        }


    }
}
