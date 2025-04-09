import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat;

        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите оператор +, -, *, /, %, ^ : ");
            char operator = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            if (operator == '/' && num2 == 0) {
                System.out.println("Ошибка: деление на ноль запрещено");
            }
            double result = 0;
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
                    } else {
                        for (int i = 0; i < -num2; i++) {
                            result *= num1;
                        }
                        result = 1 / result;
                    }
                    break;
                default:
                    System.out.println("Ошибка: операция " + operator + " не поддерживается");
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            while (true) {
                System.out.print("Хотите продолжить? [yes/no]: ");
                repeat = scanner.next().toLowerCase();

                if (repeat.equals("yes") || repeat.equals("no")) {
                    break;
                }
                System.out.println("Пожалуйста, введите только 'yes' или 'no'.");
            }
        } while (repeat.equals("yes"));

        System.out.println("Программа завершена.");
        scanner.close();
    }
}
