package chapter7_inheritance.example2;

public class MethodOverride {
    public static void main(String[] args) {
        Child child = new Child("Dohyun", 32);

        // 자식이 오버라이딩 한 메서드 호출.
        System.out.println(child.showName());

        // 부모의 메서드를 호출.
        child.callParentMethod();
    }
}
