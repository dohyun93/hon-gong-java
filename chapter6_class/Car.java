package chapter6_class;

import lombok.Builder;

@Builder
public class Car {
    String company;
    String model;
    String color;
    int maxSpeed;
    int speeds;
    static int staticSpeed = 10;

    int sumSpeedHistories(int... speeds) {
        int sum = 0;
        for (int speed : speeds) {
            sum += speed;
        }
        return sum;
    }
}
