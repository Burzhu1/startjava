import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите оператор +, -, *, /, %, ^ : ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите число: ");
        int num2 = scanner.nextInt();

        // Проверка деления на ноль для / и %
        if ((operator == '/' || operator == '%') && num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }

        // Проверка на допустимый оператор
        if ("+-*/%^".indexOf(operator) == -1) {
            throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }

        int result = 0;

        if (operator == '+') result = num1 + num2;
        if (operator == '-') result = num1 - num2;
        if (operator == '*') result = num1 * num2;
        if (operator == '/') result = num1 / num2;
        if (operator == '%') result = num1 % num2;
        if (operator == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        scanner.close();
    }
}
