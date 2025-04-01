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
        start = 1;
        end = 24;
        int count = 0;
        int num5;
        if (start % 2 == 1) {
            num5 = start;
        } else {
            num5 = start + 1;
        }
        for (int i = num5; i < end; i += 2) {
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
        int checkedNum = 3242592;
        int twos = 0;
        int currNum = checkedNum;
        while (currNum > 0) {
            if (currNum % 10 == 2) {
                twos++; 
            }
            currNum /= 10;
        }
        if (twos % 2 == 0) {
            System.out.println("Число " + checkedNum + " нечётное, " + 
                    " количество двоек" + " (" + twos + ")");
        } else {
            System.out.println("Число " + checkedNum + " чётное, " + 
                    " количество двоек" + " (" + twos + ")");
        }

        System.out.println("\n6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР\n");
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        int triangleHeight = 5;
        while (triangleHeight >= 1) {
            int symbolsInRow = 1;
            while (symbolsInRow <= triangleHeight) {
                System.out.print("#");
                symbolsInRow++;
            }
            System.out.println();
            triangleHeight--;
        }

        triangleHeight = 1;
        boolean growing = true;
        do {
            int symbolsInRow = 0;
            do {
                System.out.print("$");
                symbolsInRow++;
            } while (symbolsInRow < triangleHeight);
            System.out.println();
            if (growing) {
                triangleHeight++;
                if (triangleHeight > 3) {
                    growing = false;
                    triangleHeight = 2;
                }
            } else {
                triangleHeight--;
            }
        } while (triangleHeight > 0);

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ\n");
        for (int i = 33; i < 48; i += 2) {
            String description = Character.getName(i);
            if (i <= 33) {
                System.out.printf("\n%-8s %-10s %-30s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
            }
            System.out.printf("\n%4d %8c       %-30s%n", i, (char) i, description);
        }
        System.out.println("\n");
        for (int i = 98; i <= 122; i += 2) {
            String description = Character.getName(i);
            System.out.printf("\n%4d %8c %26s%n", i, (char) i, description);
        }

        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ'\n");
        checkedNum = 1234321;
        currNum = checkedNum;
        int reversedNumber = 0;
        while (checkedNum > 0) {
            int digit = checkedNum % 10;
            reversedNumber = reversedNumber * 10 + digit;
            checkedNum /= 10;
        }
        if (currNum == reversedNumber) {
            System.out.println("Число " + currNum + " - палиндром");
        } else {
            System.out.println("Число " + currNum + " - не палиндром");
        }
    
        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ\n");
        int num = 123329;
        int firstHalf = num / 1000;
        int secondHalf = num % 1000;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        for (int temp1 = firstHalf, temp2 = secondHalf; temp1 > 0 || 
                temp2 > 0; temp1 /= 10, temp2 /= 10) {
            sumFirstHalf += temp1 % 10;
            sumSecondHalf += temp2 % 10;
        }
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Число " + num + " - счастливое");
        } else {
            System.out.println("Число " + num + " - не счастливое");
        }
        System.out.println("Сумма цифр " + firstHalf + " = " + sumFirstHalf);
        System.out.println("Сумма " + secondHalf + " = " + sumSecondHalf);

        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА\n");
        System.out.print("   |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.print("---+");
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