import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num1 = scanner.nextInt();
        System.out.print("Введите оператор +, -, *, /, %, ^ : ");
        char operator = scanner.next().charAt(0);
        System.out.print("Введите число: ");
        double num2 = scanner.nextInt();
        double result;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num1 == 0 || num2 == 0) {
                System.out.println("Ошибка, вводимое число не может быть нулём");
                return;
            }
            result = num1 / num2;
        } else if (operator == '%') {
            if (num1 == 0 || num2 == 0) {
                System.out.println("Ошибка, вводимое число не может быть нулём");
                return;
            }
            result = num1 % num2;
        } else if (operator == '^') {
            if (num1 == 0) {
                System.out.println("Ошибка, вводимое число не может быть нулём");
                return;
            }
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else {
            System.out.println("Ошибка, неизвестный оператор");
            return;
        }
        int convert = (int) result;
        System.out.println(num1 + " " + operator + " " + num2 + " = " + convert);
        scanner.close();
    }
}