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
        System.out.println("В отрезке [" + start + ", " + end + 
                "] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

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
        int start1 = 1;
        int end1 = 24;
        int count = 0;
        int num5;
        if (start1 % 2 == 1) {
            num5 = start1;
        } else {
            num5 = start1 + 1;
        }
        for (int i = num5; i < end1; i += 2) {
            System.out.printf("%3d", i);
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
        int checkNum = 3242592;
        int twos = 0;
        int checkNum1 = checkNum;
        while (checkNum1 > 0) {
            if (checkNum1 % 10 == 2) {
                twos++; 
            }
            checkNum1 /= 10;
        }
        if (twos % 2 == 0) {
            System.out.println("Число  " + checkNum + " нечётное, " + 
                    " количество двоек" + " (" + twos + ")");
        } else {
            System.out.println("Число  " + checkNum + " чётное, " + 
                    " количество двоек" + " (" + twos + ")");
        }
        
        System.out.println("\n6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР\n");
        for (int i1 = 0; i1 < 5; i1++) {
            for (int j1 = 0; j1 < 10; j1++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        System.out.println("\n");
        int i2 = 5;
        while (i2 >= 1) {
            int j2 = 1;
            while (j2 <= i2) {
                System.out.print("#");
                j2++;
            }
            System.out.println();
            i2--;
        }
        System.out.println("\n");
        int i3 = 3;
        do {
            int j3 = 3;
            do {
                System.out.print("$");
                j3--;
            } while (j3 >= i3);
            System.out.println();
            i3--;
        } while (i3 >= 1);
        int k = 1;
        do {
            int j4 = 2;
            do {
                System.out.print("$");
                j4--;
            } while (j4 >= k);
            System.out.println();
            k++;
        } while (k <= 2);

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ\n");
        for (int i = 33; i < 48; i += 2) {
            char symbol = (char) i;
            String description = Character.getName(i);
            if (i <= 33) {
                System.out.printf("\n%-8s %-10s %-30s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
            }
            System.out.printf("\n%4d %8c       %-30s%n", i, symbol, description);
        }
        System.out.println("\n");
        for (int i = 98; i <= 122; i += 2) {
            char symbol = (char) i;
            String description = Character.getName(i);
           
            System.out.printf("\n%4d %8c %26s%n", i, symbol, description);
        }

        System.out.println("\n");
        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ'\n");
        int num = 1234321;
        int originalNumber = num;
        int reversedNumber = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println("Число " + originalNumber + " - палиндром");
        } else {
            System.out.println("Число " + originalNumber + " - не палиндром");
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
        System.out.println("Сумма " + secondHalf + " = " + sumSecondHalf);

        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА\n");
        System.out.print("   |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.print(" --+");
        for (int i = 2; i <= 9; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
} 