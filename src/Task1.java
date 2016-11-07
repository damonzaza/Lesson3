/**
 * Створити та застосувати(викликати) функцію, яка рахуватиме площу прямокутного трикутника.
 * Created by Dmytro Zamosenchuk on 07.11.16.
 */
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        double a, b;
        System.out.println("Count triangle's area");
        Scanner in = new Scanner(System.in);
        System.out.print("Input cathetus a ");
        a = in.nextDouble();
        System.out.print("Input cathetus b ");
        b = in.nextDouble();
        System.out.println("Triangle's area is "+ TriangleArea(a, b));
    }

    static double TriangleArea(double a, double b) {
        return (a * b * 0.5);
    }
}

