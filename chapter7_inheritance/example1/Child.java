package chapter7_inheritance.example1;

public class Child extends Parent {
    int channel;

    Child(String model, String color, int channel){
        super(model, color);
        this.channel = channel;
    }

    void turnOnChannel(int channel){System.out.println("Turning on channel " + channel);}
}
