public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");
        int start = -10;
        int end = 21;
        int evenSum = 0;
        int oddSum = 0;
        int counter = start;
        do {
            if (counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter;
            }
            counter++;
        } while (counter <= end);
        System.out.println("В отрезке [" + start + ", " + end + "] сумма четных чисел = " + 
                evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ\n");
        int num1 = 10;
        int num2 = 5; 
        int num3 = -1;
        int min = num1;
        int max = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.print("Числа в порядке убывания: ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("\n3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР\n");
        int num4 = 1234;
        int sum = 0;
        System.out.print("Реверсивное число: ");
        while (num4 > 0) {
            int digit = num4 % 10;
            System.out.print(digit + " ");
            sum += digit;
            num4 /= 10;
        }
        System.out.println("\nСумма цифр: " + sum);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК\n");
        int numMin1 = 1;
        int numMax1 = 24;
        int count = 0;
        int num5;
        if (numMin1 % 2 == 1) {
            num5 = numMin1;
        } else {
            num5 = numMin1 + 1;
        }
        for (int i = num5; i < numMax1; i += 2) {
            for (int j = 0; j < 1; j++) {
                System.out.printf("%3d", i);
            }
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        if (count % 5 != 0) {
            int remaining = 5 - (count % 5);
            for (int i = 0; i < remaining; i++) {
                System.out.printf("%3d", 0);
            }
        }
        
        System.out.println("\n5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ\n");
        int checksedNum = 3242592;
        int twos = 0;
        while (checksedNum > 0) {
            if (checksedNum % 10 == 2) {
                twos++; 
            }
            checksedNum /= 10;
        }
        String parity = (twos % 2 == 0) ? "четное" : "нечетное";
        System.out.println("В " + checksedNum + parity + " (" + twos + ") количество двоек");
        
        System.out.println("\n6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
          {
            int i = 5;
            while (i >= 1) {
                int j = 1;
                while (j <= i) {
                    System.out.print("#");
                    j++;
                }
                System.out.println();
                i--;
            }
          }
        
          {
            int i = 3;
            do {
                int j = 3;
                do {
                    System.out.print("$");
                    j--;
                } while (j >= i);
                System.out.println();
                i--;
            } while (i >= 1);
          }

          {
            int k = 1;
            do {
                int j = 2;
                do {
                    System.out.print("$");
                    j--;
                } while (j >= k);
                System.out.println();
                k++;
            } while (k <= 2);
          }

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ\n");
        for (int i = 33; i < 48; i += 2) {
            char symbol = (char) i;
            String description = Character.getName(i);
            if (i <= 33) {
                System.out.printf("%-8s %-10s %-30s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
            }
            System.out.printf("\n%-8d %-10c %-30s%n\n", i, symbol, description);
        }

        for (int i = 98; i <= 122; i += 2) {
            char symbol = (char) i;
            String description = Character.getName(i);
            if (i <= 98) {
                System.out.printf("\n%-8s %-10s %-30s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
            }
            System.out.printf("\n%-8d %-10c %-30s%n", i, symbol, description);
        }
        
        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ'\n");
        int num6 = 1234321;
        double lastDigit = 0;
        while (num6 >= 1) {
            lastDigit += num6 % 10;
            double reverse = (lastDigit / 10);
            if (num6 == reverse) {
                System.out.println("Число " + num6 + " - палиндром");
                break;
            } else {
                break;
            }
        }

        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ\n");
        int num7 = 123321;
        int firstHalf = num7 / 1000;
        int secondHalf = num7 % 1000;
        int sumFirstHalf = 0;
        int temp = firstHalf;
        while (temp > 0) {
            sumFirstHalf += temp % 10;
            temp /= 10;
        }
        int sumSecondHalf = 0;
        temp = secondHalf;
        while (temp > 0) {
            sumSecondHalf += temp % 10;
            temp /= 10;
        }
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Число " + num7 + " - счастливое");
        } else {
            System.out.println("Число " + num7 + " - не счастливое");
        }
        System.out.println("Сумма цифр " + firstHalf + " = " + sumFirstHalf);
        System.out.println("Сумма цифр " + secondHalf + " = " + sumSecondHalf);

        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА\n");
        int size = 9;
        System.out.print("    |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n----+---------------------------------");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d  |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
} 