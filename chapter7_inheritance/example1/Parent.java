package chapter7_inheritance.example1;

public class Parent {
    String model;
    String color;

    Parent(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void powerOn(){System.out.println("POWER ON");}
    void powerOff(){System.out.println("POWER OFF");}
    void bell(){System.out.println("BELL");}
}
