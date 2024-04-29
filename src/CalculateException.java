public class CalculateException extends RuntimeException {
    /*
     *  RuntimeException = 주로 프로그래머 실수에 의해서 발생하는 예외일 때 사용 & 런타임 중에만 실행
     */

    public CalculateException(String msg) {
        super(msg); // 부모 클래스(RuntimeException)의 생성자 호출
    }
}
