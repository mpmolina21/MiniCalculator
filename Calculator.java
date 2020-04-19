/**
 * Unit Tests - checking to see if the methods for multiplying, dividing, and calculating
 * work appropriately.
 * CS 108-2
 * @date 4/18/2020
 * @author Maria Paula Molina
 */

public abstract class Calculator implements Multiplier, Divider{
    protected int total;

    public Calculator() {
        total = 1;
    }

    public void multiply(int value){
        total *= value;
    }

    public void divide(int value){
        total /= value;
    }

    abstract int calculate();

}
