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
                int counter = 0;
                int exponent = num2 >= 0 ? num2 : -num2;
                if (exponent > 0) {
                    do {
                        result *= num1;
                        counter++;
                    } while (counter < exponent);
                }
                if (num2 < 0) {
                    result = 1 / result;
                }
                break;
            default:
                throw new IllegalArgumentException("Операция '" + operator + "' не поддерживается");
        }
        return result;
    }
}
