package ch3_operator;

public class operator {
    public static void main(String[] args) {
        String myDoucleString = "3.141592";
        Double doubleData = Double.parseDouble(myDoucleString);

        boolean biggerThanThree = doubleData > 3.0 ? true : false;

        System.out.println(biggerThanThree);
    }
}
