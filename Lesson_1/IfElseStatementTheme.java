public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean mael = true;
        if (mael) {
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
        int num2 = 666;
        String positiveOrNegativeNum;
        String numberParity;
        if (num2 == 0) {
            System.out.println("Число является 0");
        } else { 
            if (num2 < 0) {
                positiveOrNegativeNum = "является отрицательным";
            } else {
                positiveOrNegativeNum = "является положительным";
            } 
            if (num2 % 2 == 0) {
                numberParity = "чётным";
            } else {
                numberParity = "нечётным";
            }
            System.out.println("Число " + num2 + " " + positiveOrNegativeNum + " и " + numberParity);
        }
        System.out.println("\n4. ПОИСК ОДИНАКОВЫХ ЦИФР В ЧИСЛАХ\n");
        int num3 = 123;
        int num4 = 223;
       
        boolean isEqualOnes = ((num3 % 10) == (num4 % 10));
        boolean isEqualTens = (((num3 / 10) % 10) == ((num3 / 10) % 10));
        boolean isEqualHundreds = ((num3 / 100) == (num4 / 100));
        System.out.println("Числа " + num3 + " и " + num4);
        if (isEqualOnes || isEqualTens || isEqualHundreds) {
            System.out.println("Сотни   " + (num3 / 100) + " и " + (num4 / 100) + " не равны");
            System.out.println("Десятки " + ((num3 / 10) % 10) + " и " + ((num4 / 10) % 10) + " равны");
            System.out.println("Единицы " + (num3 % 10) + " и " + (num4 % 10) + " равны");
        } else {
            System.out.println("Нет равных чисел");
        }

        System.out.println("\n5. ОПРЕДЕЛЕНИЕ СИМВОЛА ПО ЕГО КОДУ\n");
        char bigLetterW = 'W';
      
        if (bigLetterW >= 'A' && bigLetterW <= 'Z') {
            System.out.println("'" + bigLetterW + "'" + " - большая буква");
        } else if (bigLetterW >= 'a' && bigLetterW <= 'z') {
            System.out.println("'" + bigLetterW + "'" + " - маленькая буква");
        } else if (bigLetterW >= '1' && bigLetterW <= '9') {
            System.out.println("'" + bigLetterW + "'" + " - является числом");
        } else {
            System.out.println("'" + bigLetterW + "'" + " - ни буква и ни цифра");
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %\n");
        double depositSum = 321123.59;
        double percentage = 0;
        int percents = 0;
        if (depositSum < 100000) {
            percentage += ((depositSum / 100) * 5);
            double depositWithInterest = depositSum + percentage;
            percents += 5;
        } else if (depositSum > 100000 && depositSum <= 300000) {
            percentage += ((depositSum / 100) * 7);
            double depositWithInterest = depositSum + percentage;
            percents += 7;
        } else if (depositSum > 300000) {
            percentage += ((depositSum / 100) * 10);
            double depositWithInterest = depositSum + percentage;
            percents += 10;
        }
        System.out.println("Сумма вклада " + depositSum + " руб");
        System.out.println("Сумма начисленных " + percents + "% " + percentage + " руб");
        System.out.println("Итоговая сумма с " + percents + "%" + " годовых " + 
                (depositSum + percentage) + " руб");

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ\n");
        int historyPercent = 59;
        int csGrade = 92;
        int historyGrade;
        int programmingGrade;
        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        } else {
            historyGrade = 2;
        }
        if (csGrade > 91) {
            programmingGrade = 5;
        } else if (csGrade > 73) {
            programmingGrade = 4;
        } else if (csGrade > 60) {
            programmingGrade = 3;
        } else {
            programmingGrade = 2;
        }
        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercent = (historyPercent + csGrade) / 2.0;
        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний балл: " + averageGrade);
        System.out.println("Средний %: " + averagePercent);
       
        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ\n");
        double monthProfit = 13025.233;
        double premisesRent = 5123.018;
        double prodCost = 9001.729;
        double annualProfit = (monthProfit) * 12 - ((premisesRent) * 12 + (prodCost) * 12);
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
    }
}
