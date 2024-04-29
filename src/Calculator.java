import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> arrList; // 연산 결과를 저장하는 ArrayList 생성

    public ArrayList<Integer> calculate(int firstNum, int secondNum, char operator) {
        switch (operator) {
            case '+':
                arrList.add(firstNum + secondNum); // 연산 결과 저장
                break;
            case '-':
                arrList.add(firstNum - secondNum);
                break;
            case '*':
                arrList.add(firstNum * secondNum);
                break;
            case '/':
                if (secondNum == 0) {
                    throw new CalculateException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."); // 사용자 정의 예외
                } else {
                    arrList.add(firstNum / secondNum);
                }
                break;
            default:
                throw new CalculateException("올바른 기호가 아닙니다."); // 사용자 정의 예외
        }

        return arrList; // 결과 값 반환
    }
}
