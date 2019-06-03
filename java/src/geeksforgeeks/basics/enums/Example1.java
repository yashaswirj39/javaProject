package geeksforgeeks.basics.enums;

/**
 * A simple enum example where enum is declared outside any class
 * (Note enum keyword instead of class keyword)
 */

enum Color{
    RED, GREEN, BLUE;
}

public class Example1 {
    public static void main(String[] args) {
        Color redColor = Color.RED;
        System.out.println(redColor);

        Color greenColor = Color.GREEN;
        System.out.println(greenColor);

        Color blueColor = Color.BLUE;
        System.out.println(blueColor);
    }
}
