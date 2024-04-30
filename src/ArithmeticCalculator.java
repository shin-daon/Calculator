public class ArithmeticCalculator extends Calculator {
    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;
    private ModOperator modOperator;

    public ArithmeticCalculator() { // 생성자를 통해 사칙연산 초기화
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
        this.modOperator = new ModOperator();
    }

    public double calculate(int firstNum, int secondNum, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = addOperator.operate(firstNum, secondNum);
                break;
            case '-':
                result = subtractOperator.operate(firstNum, secondNum);
                break;
            case '*':
                result = multiplyOperator.operate(firstNum, secondNum);
                break;
            case '/':
                result = divideOperator.operate(firstNum, secondNum);
                break;
            case '%':
                result = modOperator.operate(firstNum, secondNum);
                break;
            default:
                throw new InputException("올바른 기호가 아닙니다.");
        }

        arrList.add(result);
        return result;
    }

    public void removeResult() {
        arrList.remove(0);
    }

    public void inquiryResults() {
        for ( Double list : arrList ) {
            System.out.println("[연산 결과 : " + list + "]");
        }
    }
}
