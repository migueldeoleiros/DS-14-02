package e4;

import java.util.ArrayList;

public class Calculator {

    enum Operator{SUM,RES,MUL,DIV;
        @Override
        public String toString() {
            return switch (this) {
                case SUM -> "+";
                case RES -> "-";
                case MUL -> "*";
                case DIV -> "/";
            };
        }
        public float Operation(float valor1, float valor2) {
            return switch (this) {
                case SUM -> valor1 + valor2;
                case RES -> valor1 - valor2;
                case MUL -> valor1 * valor2;
                case DIV -> valor1 / valor2;
            };
        }
    }

    ArrayList<Operator> operations = new ArrayList<>();
    ArrayList<Float> numbers = new ArrayList<>();

    private Operator toOperator(String str){
        switch (str){
            case "+":
                return Operator.SUM;
            case "-":
                return Operator.RES;
            case "*":
                return Operator.MUL;
            case "/":
                return Operator.DIV;
        }
        throw new IllegalArgumentException();
    }

    /**
     * Public constructor of the calculator .
     */
    public Calculator() {

    }

    /**
     * Clean the internal state of the calculator
     */
    public void cleanOperations() {
        this.operations = new ArrayList<>();
        this.numbers = new ArrayList<>();
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
        operations.add(toOperator(operation));
        numbers.add(values[0]);
        if(values.length == 2 ){
            numbers.add(values[1]);
        }else if(values.length != 1){
            throw new IllegalArgumentException("too many arguments");
        }
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
        float value1=0, value2, result=0;
        int count=1;
        for(Operator opt: operations){
            if(count == 1) value1=numbers.get(0);
            value2=numbers.get(count);

            if(opt == Operator.DIV && value2 == 0){
                cleanOperations();
                throw new ArithmeticException();
            }
            result = opt.Operation(value1, value2);

            value1 = result; count++;
        }
        cleanOperations();
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
        String screen="[STATE:";
        if(operations.size() != 0 && numbers.size() != 0){
            for(int i=0; i<operations.size(); i++){
                screen += ("[" + operations.get(i) + "]");
                if(i == 0) screen += (numbers.get(0) + "_");
                screen += numbers.get(i+1);
            }
        }

        return screen + "]";
    }

}
