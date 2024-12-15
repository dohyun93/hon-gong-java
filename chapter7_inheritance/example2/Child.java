package chapter7_inheritance.example2;

public class Child extends Parent {
    int age;
    Child(String name, int age) {
        super(name);
        this.age = age;
    }

    // 부모 클래스의 메서드를 재정의(Override).
    // 동일한 시그니쳐(리턴타입, 메서드이름, 매개변수 목록) 동일해야함. 새로운 예외 던질 수 없음.
    @Override
    String showName(){
        return name+ age;
    }

    void callParentMethod(){
        System.out.println(super.showName());
    }
}
