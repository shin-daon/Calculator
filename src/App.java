import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator arCal = new ArithmeticCalculator();
        CircleCalculator cirCal = new CircleCalculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------");
            System.out.println("1. 사칙연산");
            System.out.println("2. 원의 넓이 구하기");
            System.out.println("-----------------");

            System.out.print("원하는 메뉴를 선택해주세요 : ");
            int start = sc.nextInt();

            if (start == 1) { // 사칙연산
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int firstNum = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int secondNum = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                System.out.println("결과 : " + arCal.calculate(firstNum, secondNum, operator)); // calculate 메소드에 매개변수 넘겨주기

                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) ");
                String removeReq = sc.next();

                if (removeReq.equals("remove")){
                    arCal.removeResult(); // 삭제 메소드로 code 수정
                }

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
                String inquiryReq = sc.next();

                if (inquiryReq.equals("inquiry")){
                    arCal.inquiryResults(); // 조회 메소드로 code 수정
                }

            } else if(start == 2){ // 원 넓이 구하기
                System.out.print("원의 반지름을 입력해주세요 : ");
                int radius = sc.nextInt();

                System.out.println("원의 넓이 : " + cirCal.calculateCircleArea(radius));

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
                String inquiryReq = sc.next();

                if (inquiryReq.equals("inquiry")){
                    cirCal.inquiryCircles();
                }

            } else {
                System.out.println("올바른 메뉴를 선택해주세요.");
                continue; // 다시 while 시작으로 ..
            }

            System.out.print("더 계산 하시겠습니까? (exit 입력 시 종료) ");
            String exitReq = sc.next();

            if (exitReq.equals("exit")){
                return;
            }
        }
    }
}