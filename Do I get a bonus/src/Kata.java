public class Kata{
    public static String bonusTime(final int salary, final boolean bonus) {
        if(bonus)
            return "\u00A3"+salary*10;

        else
            return "\u00A3"+salary;
    }
}