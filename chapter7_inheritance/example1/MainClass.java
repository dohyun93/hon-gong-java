package chapter7_inheritance.example1;

public class MainClass {
    public static void main(String[] args) {
        Child child = new Child("Iphone 14 Pro", "Gold", 1);

        // 부모 클래스의 필드 출력
        System.out.printf("Parent's field \"model\": %s\n", child.model);
        System.out.printf("Parent's field \"color\": %s\n", child.color);

        // 자식 클래스의 필드 출력
        System.out.printf("Child's field \"channel\": %d\n", child.channel);

        // 부모 클래스의 메서드 호출
        child.bell();
        child.powerOn();
        child.powerOff();

        // 자식 클래스의 메서드 호출
        child.turnOnChannel(child.channel);

    }
}
