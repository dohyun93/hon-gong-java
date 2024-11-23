package chapter5_referenceType;

public class StringEqualsExample {
    public static void main(String[] args) {
        /* JVM 에 대한 기초 정리.

        JVM 이 실행되면 메모리 상에 메서드 영역이 만들어지고, 이 영역 안에는 클래스로더가 클래스들을 읽어,
        정적 필드, 상수, 메서드 코드, 생성자 코드 등을 분류해 저장하고 모든 스레드가 이를 공유하도록 한다.

        또 메모리 상에 힙 영역이 있는데, 여기에는 배열, 클래스, 인터페이스, 이넘 같은 참조형 타입의 객체들이 생성된다.

        JVM 스택에서는 메서드 실행 시마다 프레임을 추가하고 메소드가 종료되면 프레임을 제거하는 동작을 한다.
        이 스택에는 기본 타입과 참조 타입의 변수들이 생성된다.
        기본 타입은 정수/실수/참거짓 타입이며, 참조 타입은 위 힙 영역에 기술한 타입들이다.

        스택에는 힙 영역의 객체에 대한 참조값을 저장하는 참조 타입의 변수 또는 기본 타입의 변수가 저장된다.

        * */

        // 이 예제는 문자열에 대한 비교를 해본다.
        // 문자열 (String) 은 클래스다. 따라서 참조타입의 변수가 스택에 선언되고 힙 영역의 객체를 가리킨다.
        // 1) 문자열 리터럴이 동일하다면 참조 타입의 변수들은 같은 객체를 가리킨다.
        // 2) 문자열 리터럴이 아닌 new String 으로 생성된 참조 타입의 변수들은 같은 문자열에 대한 객체를 생성하더라도 다른 참조 객체를 가리킨다.

        // <주의>
        // equals 는 값 비교, == 는 가리키는 객체의 동일유무를 비교한다.

        // 1) 문자열 리터럴로 만든 참조 변수
        String literalString1 = "HongGong";
        String literalString2 = "HongGong";

        // '참조하는 대상의 문자열 값' 비교
        if (literalString1.equals(literalString2)) {
            System.out.println("[값 비교 (문자열 리터럴)] 가리키는 객체가 동일한 문자열 값을 지닙니다."); //
        } else{
            System.out.println("[값 비교 (문자열 리터럴)] 가리키는 객체가 동일하지 않은 문자열 값을 지닙니다.");
        }

        // '참조하는 대상' 비교
        if (literalString1 == literalString2){
            System.out.println("[참조 비교 (문자열 리터럴)] 동일한 참조 객체를 가리킵니다."); //
        } else{
            System.out.println("[참조 비교 (문자열 리터럴)] 동일하지 않은 참조 객체를 가리킵니다.");
        }


        // 2) new String 으로 생성한 참조 변수들
        String constructorString3 = new String("HongGong");
        String constructorString4 = new String("HongGong");

        if (constructorString3.equals(constructorString4)) {
            System.out.println("[값 비교 (new String)] 두 참조 변수가 가리키는 new String 으로 만들어진 문자열 객체들은 같은 값을 갖는다."); //
        } else{
            System.out.println("[값 비교 (new String)] 두 참조 변수가 가리키는 new String 으로 만들어진 문자열 객체들은 같은 값을 갖지 않는다.");
        }

        if (constructorString3 == constructorString4) {
            System.out.println("[참조 비교 (new String)] 두 참조 변수가 가리키는 new String 으로 만들어진 문자열 객체들은 같은 객체다.");
        } else{
            System.out.println("[참조 비교 (new String)] 두 참조 변수가 가리키는 new String 으로 만들어진 문자열 객체들은 같은 객체가 아니다."); //
        }

        // 3) 문자열 리터럴로 만든 참조 변수와 new String 으로 만든 문자열 객체를 가리키는 참조 변수.
        if (literalString1.equals(constructorString3)){
            System.out.println("[값 비교] (문자열 리터럴 vs new String) : 두 참조 변수가 가리키는 객체는 동일한 값을 갖습니다."); //
        } else{
            System.out.println("[값 비교] (문자열 리터럴 vs new String) : 두 참조 변수가 가리키는 객체는 동일한 값을 갖지 않습니다.");
        }

        if (literalString1 == constructorString3){
            System.out.println("[참조 비교] (문자열 리터럴 vs new String) : 두 참조 변수는 동일한 객체를 가리킵니다.");
        } else{
            System.out.println("[참조 비교] (문자열 리터럴 vs new String) : 두 참조 변수는 동일한 객체를 가리키지 않습니다."); //
        }
    }
}
