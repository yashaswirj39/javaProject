package geeksforgeeks.basics.enums;


/**
 * Important:
 * Internally every enum <ClassName></Class> is converted to class <ClassName>
 * class Color {
 *      public static final Color RED = new Color();
 *      public static final Color BLUE = new Color();
 *      public static final Color GREEN = new Color();
 * }
 */

/**
 * simple program to
 */
public class Example3 {
    enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }
    public static void main(String[] args) {
        Day day = Day.valueOf("MONDAY");
        System.out.println(day);
    }
}
