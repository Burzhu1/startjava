public class Calculator {
    public static void main(String[] args) {
        int num = 2;
        int num1 = 3;
        int result = 1;
        char operation = '+';
        if (operation == '+') {
            int sum = num + num1;
             System.out.println(num + " + " + num1 + " = " + sum);
         } else if (operation == '-') {
            int sum = num - num1;
            System.out.println(num + " - " + num1 + " = " + sum);
        } else if (operation == '*') {
            int sum = num * num1;
            System.out.println(num + " * " + num1 + " = " + sum);
        } else if (operation == '/') {
            double sum = num / num1;
            System.out.println(num + " / " + num1 + " = " + sum);
        } else if (operation == '^') {
            for (int i = 0; i < num1; i++) {
            result *= num;
        }
        System.out.println(num + " ^ " + num1 + " = " + result);
        } else if (operation == '%') {
            double sum = (double) (num % num1) / num1;
            System.out.println(num + " % " + num1 + " = " + sum);
        }
    }
}