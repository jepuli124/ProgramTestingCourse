package week6.calculator.calculator.src.main.java.com.example;

import java.util.Scanner;

/**111110
 * Grade calculator app
 *
 */
public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator(new Scanner(System.in));
        c.askGrades();
        System.out.println(c.calculateAverage());
    }
}
