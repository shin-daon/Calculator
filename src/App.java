import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] resultArr = new int[10]; // 연산 결과를 저장하는 배열
        int lastResult = 0; // 배열의 가장 마지막 결과만 저장
        int count = 0; // 인덱스 증가에 쓰일 변수

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

            if (count <= 9) {
                resultArr[count] = result;      // 연산의 결과를 배열에 저장
                lastResult = resultArr[count];  // 마지막 결과를 lastResult에 저장
                count++;                        // 인덱스 증가

            } else if (count >= 10) {
                for(int i=1; i<resultArr.length; i++){
                    resultArr[i-1] = resultArr[i];  // 한칸씩 앞으로 배열 값 이동시키기
                }
                resultArr[9] = result;
                lastResult = result;
            }

            System.out.println("더 계산 하시겠습니까? (exit 입력 시 종료)");
            String comment = sc.next();

            if (comment.equals("exit")){
                return; // 나를 호출해준 메소드(main)에게 돌아감
            }
        }
    }
}