package e4;

public class Calculator {

    enum operator {SUM,REST,MULT,DIV}

    /**
     * Public constructor of the calculator .
     */
    public Calculator() {

    }

    /**
     * Clean the internal state of the calculator
     */
    public void cleanOperations() {

    }

    /**
     * Add a new operation to the internal state of the calculator.
     * It is worth mentioning that the calculator behaves in an accumulative way ,
     * thus only first operation has two operands.
     * The rest of computations work with the accumulated value and only an extra
     * new operand. Second input value must be ignored if the operation does not
     * correspond to the first one.
     *
     * @param operation operation to add , as string , "+", "-", "*", "/".
     * @param values    Operands of the new operation (one or two operands ).
     *                  Uses the varargs feature.
     *                  https :// docs.oracle.com/javase /8/ docs/technotes/guides/language/varargs.html
     * @throws IllegalArgumentException If the operation does not exist.
     */
    public void addOperation(String operation, float... values) {

    }

   /**
     * Execute the set of operations of the internal state of the calculator .
     * Once execution is finished , internal state (operands and operations)
     * is restored (EVEN if exception occurs ).
     * This calculator works with "Batches" of operations.
     *
     * @return result of the execution
     * @throws ArithmeticException If the operation returns an invalid value
     *                             (division by zero)
     */
    public float executeOperations() {
        float result=0;

        return result;
    }

    /**
     * Current internal state of calculator is printed
     * FORMAT:
     * "[{+/ -/"/"/*}] value1_value2 [{+/ -/"/"/*}] value1 [{+/ -/"/"/*}] value1 {...}"
     *
     * @return String of the internal state of the calculator
     */
    @Override
    public String toString() {
        String screen="";

        return screen;
    }

}
