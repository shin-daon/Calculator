import java.util.ArrayList;

public abstract class Calculator {
    protected ArrayList<Double> arrList; // 접근 제어자 변경
    protected ArrayList<Double> circleList; // 접근 제어자 변경
    public final double PI = 3.14; // final = 하나의 값만 계속 저장해야 하는 변수에 사용하는 예약어 -> 원주율 3.14는 계속 동일 값으로 사용해야하니 final로 지정 후 사용하였음

    public Calculator() {
        arrList = new ArrayList<>();
        circleList = new ArrayList<>();
    }

    public ArrayList<Double> getArrList() { // Getter
        return arrList;
    }

    public void setArrList(ArrayList<Double> arrList) { // Setter
        this.arrList = arrList;
    }

    public ArrayList<Double> getCircleList() { // Getter
        return circleList;
    }

    public void setCircleList(ArrayList<Double> circleList) { // Setter
        this.circleList = circleList;
    }

}
