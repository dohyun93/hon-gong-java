package chapter2_variable_type;

public class cast{
    public static void main(String[] args) {
        // 문자열을 실수로 변경 : Double.parseDouble(문자열)
        String var1 = "1.23";
        double var1Int = Double.parseDouble(var1);
        System.out.println(var1Int);

        // 정수를 문자열로 변경 : String.valueOf(정수)
        int myInt = 999;
        String intToString = String.valueOf(myInt);

    }
}