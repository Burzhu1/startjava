import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ХАРАКТЕРИСТИК КОМПЬЮТЕРА");
        byte core = 4;
        short mhz = 3500;
        System.out.println("Процессор: ядер " + core + ", чистота процессора " + mhz + " MHz");
        char gpu = '8';
        System.out.println("Видеокарта: объём видеопамяти " + gpu + " GPU");
        long ram = 16;
        float mhzram = 2400;
        System.out.println("Оперативная память: объем памяти " + ram + "GB, " + 
                " чистота ОЗУ " + mhzram + " MHz");
        double ssd = 1.8;
        int dlspeed = 6000;
        System.out.println("SSD: объем памяти " + ssd + "TB, " + dlspeed + "GB/сек");
        boolean winos10 = true;
        System.out.println("ОС Windows 10: " + winos10);

        System.out.println(" ");
        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        double pen = 105.5;
        double book = 235.83;
        double discount = 11;
        double cost = pen + book;
        double discount1 = (cost) * discount / 100;
        double cost1 = cost - discount1;
        System.out.println("Cтоимость товаров без скидки = " + cost);
        System.out.println("Cумма скидки = " + (pen + book) * discount / 100);
        System.out.println("Cтоимость товаров со скидкой = " + cost1);
        System.out.println(" ");
        System.out.println("3. ВЫВОД СЛОВА JAVA");
        System.out.println(" ");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println(" ");
        System.out.println("4. ВЫВОД MIN И MAX ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ");
        byte max = 127;
        System.out.println("byte_max: " + max);
        max += 1;
        System.out.println("byte_max++:" + max);
        max -= 2;
        System.out.println("byte_max--: " + max);
        short max1 = 32767;
        System.out.println("short_max: " + max1);
        max1 += 1;
        System.out.println("short_max++: " + max1);
        max1 -= 2;
        System.out.println("short_max--: " + max1);
        int max2 = 2147483647;
        System.out.println("int_max: " + max2);
        max2 += 1;
        System.out.println("int_max++: " + max2);
        max2 -= 2;
        System.out.println("int_max--: " + max2);
        long max3 = 9223372036854775807L;
        System.out.println("long_max: " + max3);
        max3 += 1;
        System.out.println("long_max++: " + max3);
        max3 -= 2;
        System.out.println("long_max--: " + max3);
        char max4 = 65535;
        System.out.println("char_max: " + (int) max4);
        max4 += 1;
        System.out.println("char_max++: " + (int) max4);
        max4 -= 2;
        System.out.println("char_max--: " + (int) max4);

        System.out.println(" ");
        System.out.println("5. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ");
        int num = 2;
        int num1 = 5;
        System.out.println("Перестановка значений переменных с помощью третьей переменной");
        int num2 = num;
        num = num1;
        num1 = num2;
        System.out.println("После обмена: num = " + num + ", num1 = " + num1);
        System.out.println("Перестановка значений переменных с помощью арифметических операций");
        num = num + num1;
        num1 = num - num1;
        num = num - num1;
        System.out.println("После обмена: num = " + num + ", num1 = " + num1);
        System.out.println("Перестановка значений переменных с помощью побитовой операции");
        num ^= num1;
        num1 ^= num;
        num ^= num1;
        System.out.println("После обмена: num = " + num + ", num1 = " + num1);

        System.out.println(" ");
        System.out.println("6. ВЫВОД СИМВОЛОВ И ИХ КОДОВ");
        int usd = 36;
        int asterisc = 42;
        int email = 64;
        int caret = 94;
        int tilde = 126;
        char usd1 = (char) usd;
        char asterisc1 = (char) asterisc;
        char email1 = (char) email;
        char caret1 = (char) caret;
        char tilde1 = (char) tilde;
        System.out.println("36 = " + usd1);
        System.out.println("42 = " + asterisc1);
        System.out.println("64 = " + email1);
        System.out.println("94 = " + caret1);
        System.out.println("126 = " + tilde1);

        System.out.println(" ");
        System.out.println("7. ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParen = '(';
        char rightParen = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParen + " " + rightParen + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + "" + underscore + "" + underscore + "" + underscore + "" + 
                underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println(" ");
        System.out.println("8. МАНИПУЛЯЦИИ С СОТНЯМИ, ДЕСЯТКАМИ И ЕДИНИЦАМИ ЧИСЛА");
        int numbers = 123;
        int numbers1 = numbers / 100;
        int numbers2 = numbers % 100;
        int numbers3 = numbers2 / 10;
        int numbers4 = numbers2 % 10;
        System.out.println("Число " + numbers + "содержит:");
        System.out.println("сотен - " + numbers1);
        System.out.println("десятков - " + numbers3);
        System.out.println("единиц - " + numbers4);
        System.out.println("Сумма разрядов = " + numbers1 + numbers3 + numbers4);
        System.out.println("Произведение разрядов = " + numbers1 * numbers3 * numbers4);

        System.out.println(" ");
        System.out.println("9. ПЕРЕВОД СЕКУНД В ЧАСЫ, МИНУТЫ И СЕКУНДЫ");
        int totalsec = 86399; 
        int hours = totalsec / 3600;
        int min = totalsec % 3600 / 60;
        int sec = totalsec % 60;
        System.out.println(hours + ":" + min + ":" + sec);

        System.out.println(" ");
        System.out.println("10) РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        pen = new BigDecimal("105.5").doubleValue();
        book = new BigDecimal("235.83").doubleValue();
        BigDecimal discount2 = new BigDecimal("11");
        BigDecimal cost2 = BigDecimal.valueOf(pen).add(BigDecimal.valueOf(book));
        BigDecimal discount3 = BigDecimal.valueOf(cost1).multiply(discount2.divide(BigDecimal.valueOf(100)))
                .setScale(2, RoundingMode.HALF_UP);
        double cost3 = cost2.subtract(discount3).doubleValue();
        System.out.println("Cтоимость товаров без скидки = " + cost2);
        System.out.println("Cумма скидки = " + discount3);
        System.out.println("Cтоимость товаров со скидкой = " + cost3);
    }   
}