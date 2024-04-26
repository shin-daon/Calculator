import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String str = sc.next();
            char operator = str.charAt(0);

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
            System.out.println("더 계산 하시겠습니까? (exit 입력 시 종료)");
            String comment = sc.next();

            if (comment.equals("exit")){
                return; // 나를 호출해준 메소드(main)에게 돌아감
            }
        }
    }
}