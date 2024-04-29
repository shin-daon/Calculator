import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    public double calculate(int firstNum, int secondNum, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    throw new InputException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = firstNum / secondNum;
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
