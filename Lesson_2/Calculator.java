public class Calculator {
    public static double calculate(int num1, int num2, char operator) {
        double result;
        if ((operator == '/' || operator == '%') && num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
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
                result = (double) num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = 1;
                int exponent = Math.abs(num2);
                for (int i = 0; i < exponent; i++) {
                    result *= num1;
                }
                result = num2 < 0 ? 1 / result : result;
                break;
            default:
                throw new IllegalArgumentException("Операция '" + operator + "' не поддерживается");
        }
        return result;
    }
}