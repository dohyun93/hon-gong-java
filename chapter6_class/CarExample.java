package chapter6_class;


public class CarExample {
    public static void main(String[] args) {
        var myCar = buildCar();
        int speedSum = myCar.sumSpeedHistories(1, 2, 3, 4, 5, 6,7, 8, 9, 10);
        System.out.println(speedSum);

        // static field : can be used directly via Class.
        int staticSpeed = Car.staticSpeed;
        System.out.printf("staticSpeed = %d\n", staticSpeed);

        // Singleton 객체 생성.
        SingletonObject single1 = SingletonObject.getInstance();
        SingletonObject single2 = SingletonObject.getInstance();
        if(single1 == single2) {
            System.out.println("singleton objects are equal");
        }

        /*
        클래스 접근제한자 :
        public : 외부 클래스에서 접근 가능.
        protected : 같은 패키지 또는 자식 클래스에서 접근 가능.
        default : 같은 패키지에 소속된 클래스에서만 접근가능.
        private : 외부에서 접근 불가.
         */
    }

    private static Car buildCar(){
        return Car.builder()
                .company("HMC")
                .model("Grandeur")
                .color("Blue")
                .maxSpeed(200)
                .speeds(100)
                .build();
    }


}
