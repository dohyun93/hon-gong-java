package chapter5_referenceType.Enum;


public enum Week {
    MONDAY("Monday"),
    TUESDAY("Tuesday");

    String date;

    Week(String date) {
        this.date = date;
    }
}
