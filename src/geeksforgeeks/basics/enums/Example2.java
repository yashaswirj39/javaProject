package geeksforgeeks.basics.enums;

/**
 * Enum inside a class
 */

public class Example2 {
    enum Color{
        /**
         * First line inside enum should be list of constants and then other things like methods,
         * variables and constructor.
         */
        RED, GREEN, BLACK;
    }

    public static void main(String[] args) {
        Color redColor = Color.RED;
        Color greenColor = Color.GREEN;
        Color blackColor = Color.BLACK;
        System.out.println(redColor);
        System.out.println(greenColor);
        System.out.println(blackColor);
    }
}
