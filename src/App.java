import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(); // 배열에서 List로 변경

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0); // 한번에 char를 받도록 수정

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
                    if (secondNum == 0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = firstNum / secondNum;
                    }
                    break;
                default:
                    System.out.println("올바른 기호가 아닙니다.");
                    break;
            }

            System.out.println("결과: " + result);
            arrList.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeReq = sc.next();

            if (removeReq.equals("remove")){
                arrList.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryReq = sc.next();

            if (inquiryReq.equals("inquiry")){
                for ( Integer list : arrList ) {
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