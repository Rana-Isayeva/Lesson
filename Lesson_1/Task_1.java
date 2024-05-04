package Lesson_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        System.out.println("Calculation: ");

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter value for x: ");
        int x = sc.nextInt();

        System.out.println("Enter value for y: ");
        int y = sc.nextInt();

        int a = x + y;
        int b = x - y;
        int c = x*y;
        int d = x/y;

        System.out.println("Sum: " + a);
        System.out.println("Subtraction: " + b);
        System.out.println("Product: " + c);
        System.out.println("Fraction: " + d);

    }
}
