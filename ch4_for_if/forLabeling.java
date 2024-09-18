package ch4_for_if;

public class forLabeling {
    public static void main(String[] args) {
        // for 앞에 라벨을 붙이고, break로 이 라벨을 지정하면 이중 반복문을 한 번에 빠져나올 수 있다.
        OUTER: for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if (j % 2 == 0 && i == 3){
                    break OUTER;
                }
                System.out.print("i and j: " + i + " " + j + '\n');
            }
        }
    }
}
