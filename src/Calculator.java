import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> arrList; // 외부에서 직접 접근 불가하도록 수정

    public Calculator(ArrayList<Integer> arrList) {
        this.arrList = new ArrayList<>(); // arrList 초기화
    }

    public int calculate(int firstNum, int secondNum, char operator) {
        int result = 0;

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
                    throw new CalculateException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = firstNum / secondNum;
                }
                break;
            default:
                throw new CalculateException("올바른 기호가 아닙니다.");
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

    public void inquiryResults() {
        for ( Integer list : arrList ) {
            System.out.println("[연산 결과 : " + list + "]");
        }
    }
}
