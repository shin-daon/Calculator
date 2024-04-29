import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> arrList; // 외부에서 직접 접근 불가하도록 수정
    private ArrayList<Double> circleList; // 원의 넓이 결과를 저장하는 컬렉션 생성
    public final double PI = 3.14; // final = 하나의 값만 계속 저장해야 하는 변수에 사용하는 예약어 -> 원주율 3.14는 계속 동일 값으로 사용해야하니 final로 지정 후 사용하였음

    public Calculator(ArrayList<Integer> arrList, ArrayList<Double> circleList) { // 생성자 수정
        this.arrList = arrList;
        this.circleList = circleList;
    }

    public ArrayList<Integer> getArrList() { // Getter
        return arrList;
    }

    public void setArrList(ArrayList<Integer> arrList) { // Setter
        this.arrList = arrList;
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

    public void removeResult() {
        arrList.remove(0);
    }

    public void inquiryResults() {
        for ( Integer list : arrList ) {
            System.out.println("[연산 결과 : " + list + "]");
        }
    }

    public double calculateCircleArea(int radius){
        double result = PI * radius * radius; // 원 넓이 계산
        circleList.add(result); // 계산 값을 list에 저장

        return result;
    }

    public ArrayList<Double> getCircleList() { // getter
        return circleList;
    }

    public void setCircleList(ArrayList<Double> circleList) { // setter
        this.circleList = circleList;
    }

    public void inquiryCircles() {
        for ( Double list : circleList ) {
            System.out.println("[원의 넓이 계산 결과 : " + list + "]");
        }
    }
}
