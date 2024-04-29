import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // 인스턴스 생성

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            System.out.println("결과 : " + cal.calculate(firstNum, secondNum, operator)); // calculate 메소드에 매개변수 넘겨주기

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeReq = sc.next();

            if (removeReq.equals("remove")){
                cal.getArrList().remove(0); // getter를 통해 가져오도록 코드 수정
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryReq = sc.next();

            if (inquiryReq.equals("inquiry")){
                for ( Integer list : cal.getArrList() ) {
                   System.out.println("[연산 결과 : " + list + "]");
                }
            }

            System.out.println("더 계산 하시겠습니까? (exit 입력 시 종료)");
            String exitReq = sc.next();

            if (exitReq.equals("exit")){
                return;
            }
        }
    }
}