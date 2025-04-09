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
        if ((operator == '/' || operator == '%') && num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = 1;
                if (num2 >= 0) {
                    for (int i = 0; i < num2; i++) {
                        result *= num1;
                    }
                } 
                break;
            default:
                System.out.println("Неизвестный оператор: " + operator);
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        scanner.close();
    }
}
