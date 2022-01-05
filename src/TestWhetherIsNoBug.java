/**
 * The type Test whether is no bug.
 */
public class TestWhetherIsNoBug {

    /**
     * Arithmetic.
     */
    @ArithmeticCheck
    public void arithmetic() {
        System.out.println("1234567890");
    }

    /**
     * Addition.
     */
    @ArithmeticCheck
    public void addition() {
        System.out.println("1+1=" + 1 + 1);
    }

    /**
     * Substraction.
     */
    @ArithmeticCheck
    public void substraction() {
        System.out.println("1-1=" + (1 - 1));
    }

    /**
     * Multiplication.
     */
    @ArithmeticCheck
    public void multiplication() {
        System.out.println("3 x 5=" + 3 * 5);
    }

    /**
     * Division.
     */
    @ArithmeticCheck
    public void division() {
        System.out.println("6 / 0=" + 6 / 0);
    }

    /**
     * Ziwojieshao.
     */
    public void ziwojieshao() {
        System.out.println("my program has no bug!");
    }

}
