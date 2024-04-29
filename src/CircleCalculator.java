import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    public double calculateCircleArea(int radius){
        double result = PI * radius * radius; // 원 넓이 계산
        circleList.add(result); // 계산 값을 list에 저장

        return result;
    }

    public void inquiryCircles() {
        for ( Double list : circleList ) {
            System.out.println("[원의 넓이 계산 결과 : " + list + "]");
        }
    }
}
