package chapter6_class.subpackage;

import chapter6_class.ParentClass;

public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        // 다른 패키지에 있지만, 자식은 부모 클래스의 protected 에는 접근할 수 있다.
        // 만약 Default 접근 제한자면 부모-자식이어도 반드시 같은 패키지에 있어야 접근할 수 있다.
        ChildClass c = new ChildClass();
        System.out.println(c.counter);
    }
}
