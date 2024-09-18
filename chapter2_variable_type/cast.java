package chapter2_variable_type;

import javax.swing.*;

public class cast{
    public static void main(String[] args) {
        // 문자열을 실수로 변경 : Double.parseDouble(문자열)
        String stringDouble = "1.23";
        double parsedDouble = Double.parseDouble(stringDouble);
        System.out.println(parsedDouble);

        // 정수를 문자열로 변경 : String.valueOf(정수)
        int myInt = 999;
        String stringfiedInt = String.valueOf(myInt);
        System.out.println(stringfiedInt);
    }
}