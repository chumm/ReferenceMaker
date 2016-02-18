package tests;

/**
 * Created by CHUMM on 18/02/2016.
 *
 * This abstract class defines static variables for certain test functions to reduce magic numbers, making life easier.
 */
public class TestBase {
    protected static final byte BELOW_ZERO = -1;
    protected static final byte IS_ZERO = 0;
    protected static final byte ABOVE_ZERO = 1;

    protected static final byte MAX_VALUE = 127;
    protected static final byte MAX__AUTHOR_VALUE = 16;

    public static final boolean isPositive(int x)
    {
        boolean isPositive = (x % (x - 1)) * x == x;
        return isPositive;
    }

}
