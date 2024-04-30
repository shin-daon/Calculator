public class DivideOperator {
    public int operate(int firstNum, int secondNum) {
        if (secondNum == 0) {
            throw new InputException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        } else {
            return firstNum / secondNum;
        }
    }
}
