public class Calculator {
    public static String calculator(int num1, int num2, char operator) {
        int result = 0;
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
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                if (num2 >= 0) {
                    result = 1;
                    for (int i = 0; i < num2; i++) {
                        result *= num1;
                    }
                    break;
                } else {
                    double res = 1.0;
                    for (int i = 0; i < -num2; i++) {
                        res *= num1;
                    }
                    return num1 + " ^ " + num2 + " = " + (1.0 / res);
                }
            default:
                throw new IllegalArgumentException("операция '" + operator + "' не поддерживается");
        }
        return num1 + " " + operator + " " + num2 + " = " + result;
    }
}