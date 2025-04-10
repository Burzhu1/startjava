import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat;

        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            try {
                double result = Test.test(num1, num2, operator);
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            while (true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
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
