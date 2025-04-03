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
        int result;
        
        if (num1 == 0 || num2 == 0) {
            System.out.println("Ошибка, деление на ноль запрещено");
            return;
        } else if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else if (operator == '%') {
            result = num1 % num2;
        } else if (operator == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else {
            System.out.println("Ошибка, неизвестный оператор");
            return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        scanner.close();
    }
}