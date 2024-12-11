package chapter5_referenceType;

import chapter5_referenceType.Enum.Week;

public class EnumExample{
    public static void main(String[] args) {

        Week today = Week.MONDAY;

        Week tomorrow = CheckDate(today);
        System.out.println(tomorrow);

        today = Week.TUESDAY;
        tomorrow = CheckDate(today);
        System.out.println(tomorrow);
    }

    private static Week CheckDate(Week date){
        Week tomorrow = switch(date){
            case Week.MONDAY -> {
                System.out.println("Today is Monday");
                yield Week.TUESDAY;
            }
            default -> {
                System.out.println("Today is not Monday");
                yield null;
            }
        };
        return tomorrow;
    }

}

