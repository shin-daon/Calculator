import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> arrList; // 외부에서 직접 접근 불가하도록 수정

    public Calculator() {
        this.arrList = new ArrayList<>();
    }

    public int calculate(int firstNum, int secondNum, char operator) { // 반환타입 int로 수정.. 흑흑
        int result = 0;

        switch (operator) {
            case '+':
                result = firstNum + secondNum; // 연산 결과 저장
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    throw new CalculateException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."); // 사용자 정의 예외
                } else {
                    result = firstNum / secondNum;
                }
                break;
            default:
                throw new CalculateException("올바른 기호가 아닙니다."); // 사용자 정의 예외
        }

        arrList.add(result);
        return result;
    }

    public ArrayList<Integer> getArrList() { // App class에서 arrList를 가져오기 위해 Getter 생성
        return arrList;
    }

    public void setArrList(ArrayList<Integer> arrList) { // Setter
        this.arrList = arrList;
    }

    public void removeResult() {
        arrList.remove(0);
    }
}
