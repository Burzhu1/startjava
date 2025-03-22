public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean male = true;
        if (male) {
            System.out.println("Поступить на военный учёт");
        } else {
            System.out.println("Поступать на военный учёт не надо");
        }
        int age = 16;
        if (age > 18) {
            System.out.println("Уже взрослый");
        } else {
            System.out.println("Ещё ребёнок");
        }
        double height = 1.7;
        if (height < 1.8) {
            System.out.println("Рост 1.8 м");
        } else {
            System.out.println("Рост не 1.8 м");
        }
        char name = "Egor".charAt(0);
        if (name == 'M') {
            System.out.println("Имя начинается на букву M");
        } else if (name == 'I') {
            System.out.println("Имя начинается на букву I");
        } else {
            System.out.println("Имя не начинается на буквы M и I");
        }

        System.out.println("\n2. ПОИСК БОЛЬШЕГО ЧИСЛА\n");
        int num = 20;
        int num1 = 34;
        if (num > num1) {
            System.out.println(num + " > " + num1);
        } else if (num < num1) {
            System.out.println(num1 + " > " + num);
        } else {
            System.out.println(num + " = " + num1);
        }
        
        System.out.println("\n3. ПРОВЕРКА ЧИСЛА\n");
        int checkedNum = 666;
        String positiveOrNegativeNum;
        String numberParity;
        if (checkedNum == 0) {
            System.out.println("Число является 0");
        } else { 
            if (checkedNum < 0) {
                positiveOrNegativeNum = "является отрицательным";
            } else {
                positiveOrNegativeNum = "является положительным";
            } 
            if (checkedNum % 2 == 0) {
                numberParity = "чётным";
            } else {
                numberParity = "нечётным";
            }
            System.out.println("Число " + checkedNum + " " + positiveOrNegativeNum + " и " + numberParity);
        }

        System.out.println("\n4. ПОИСК ОДИНАКОВЫХ ЦИФР В ЧИСЛАХ\n");
        int num3 = 123;
        int num4 = 223;
        boolean isEqualOnes = ((num3 % 10) == (num4 % 10));
        boolean isEqualTens = (((num3 / 10) % 10) == ((num3 / 10) % 10));
        boolean isEqualHundreds = (num3 / 100 == (num4 / 100));
        System.out.println("Числа " + num3 + " и " + num4);
        if (isEqualOnes || isEqualTens || isEqualHundreds) {
            System.out.println("Сотни   " + (num3 / 100) + " и " + (num4 / 100) + " равны");
            System.out.println("Десятки " + ((num3 / 10) % 10) + " и " + ((num4 / 10) % 10) + " равны");
            System.out.println("Единицы " + (num3 % 10) + " и " + (num4 % 10) + " равны");
        } else {
            System.out.println("Нет равных чисел");
        }

        System.out.println("\n5. ОПРЕДЕЛЕНИЕ СИМВОЛА ПО ЕГО КОДУ\n");
        char someChar = 'W';
        if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("'" + someChar + "'" + " - большая буква");
        } else if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("'" + someChar + "'" + " - маленькая буква");
        } else if (someChar >= '1' && someChar <= '9') {
            System.out.println("'" + someChar + "'" + " - является числом");
        } else {
            System.out.println("'" + someChar + "'" + " - ни буква и ни цифра");
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %\n");
        double depositSum = 321123.59;
        double percentage = 0;
        int percents = 0;
        if (depositSum < 100000) {
            percents = 5;
        } else if (depositSum <= 300000) {
            percents = 7;
        } else {
            percents = 10;
        }
        percentage = (depositSum * percents) / 100;
        double depositWithInterest = depositSum + percentage;
        System.out.println("Сумма вклада: " + depositSum + " руб");
        System.out.println("Сумма начисленных " + percents + "%: " + percentage + " руб");
        System.out.println("Итоговая сумма с " + percents + "% годовых: " + depositWithInterest + " руб");

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ\n");
        int historyPercent = 59;
        int csPercent = 92;
        int historyGrade = 2;
        int csGrade = 2;
        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }
        if (csPercent > 91) {
            csGrade = 5;
        } else if (csPercent > 73) {
            csGrade = 4;
        } else if (csPercent > 60) {
            csGrade = 3;
        }
        double averageGrade = (historyGrade + csGrade) / 2.0;
        double averagePercent = (historyPercent + csPercent) / 2.0;
        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + csGrade);
        System.out.println("Средний балл: " + averageGrade);
        System.out.println("Средний %: " + averagePercent);
       
        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ\n");
        double monthProfit = 13025.233;
        double premisesRent = 5123.018;
        double prodCost = 9001.729;
        double annualProfit = (monthProfit - premisesRent - prodCost) * 12;
        annualProfit = Math.round(annualProfit * 100.0) / 100.0;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
    }
}
