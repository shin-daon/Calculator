public class ArithmeticCalculator extends Calculator {
    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;

    public ArithmeticCalculator() { // 생성자를 통해 사칙연산 초기화
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
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
                if (secondNum == 0) {
                    throw new InputException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = divideOperator.operate(firstNum, secondNum);
                }
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
