public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean mael = true;
        boolean female = false;
        if (female != mael) {
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
        System.out.println(" ");
        System.out.println("2. ПОИСК БОЛЬШЕГО ЧИСЛА");
        int num = 20;
        int num1 = 34;
        if (num > num1) {
            System.out.println(num + " > " + num1);
        } else if (num < num1) {
            System.out.println(num1 + " > " + num);
        } else {
            System.out.println(num + " = " + num1);
        }
        System.out.println(" ");
        System.out.println("3. ПРОВЕРКА ЧИСЛА");
        int num2 = 666;
        if ((num2 != 0) && (num2 % 2 == 0) && (num2 > 0)) {
            System.out.println("Число " + num2 + " является положительным и чётным");
        } else if ((num2 != 0) && (num2 % 2 == 0) && (num2 < 0)) {
            System.out.println("Число " + num2 + " является отрицательным и чётным");
        } else if ((num2 != 0) && (num2 % 2 == 1) && (num2 > 0)) {
            System.out.println("Число " + num2 + " является положительным и не чётным");
        } else if ((num2 != 0) && (num2 % 2 == 1) && (num2 < 0)) {
            System.out.println("Число " + num2 + " является отрицательным и не чётным");
        } else {
            System.out.println("Число является 0");
        }
        
        System.out.println(" ");
        System.out.println("4. ПОИСК ОДИНАКОВЫХ ЦИФР В ЧИСЛАХ");
        int num3 = 123;
        int num4 = 223;
       
        int num3Units = num3 % 10;
        int num3Tens = (num3 / 10) % 10;
        int num3Hundreds = num3 / 100;

        int num4Units = num4 % 10;
        int num4Tens = (num4 / 10) % 10;
        int num4Hundreds = num4 / 100;
        boolean equalUnits = (num3Units == num4Units);
        boolean equalTens = (num3Tens == num3Tens);
        boolean equalHundreds = (num3Hundreds == num4Hundreds);
        System.out.println("Числа " + num3 + " и " + num4);
        if (equalUnits || equalTens || equalHundreds) {
            System.out.println("Сотни   " + num3Hundreds + " >< " + num4Hundreds);
            System.out.println("Десятки " + num3Tens + " >< " + num4Tens);
            System.out.println("Единицы " + num3Units + " >< " + num4Units);
        } else {
            System.out.println("Нет равных чисел");
        }

        System.out.println(" ");
        System.out.println("5. ОПРЕДЕЛЕНИЕ СИМВОЛА ПО ЕГО КОДУ");
        char  bigLetterW = '\u0057';
        char smallLetterW = '\u0077';
        char symbol = '\u005E';
        char numOne = '\u0031';
        if (bigLetterW >= '\u0041' && bigLetterW <= '\u005A') {
            System.out.println("'" + bigLetterW + "'" + " - большая буква");
        } else if (bigLetterW >= '\u0061' && bigLetterW <= '\u007A') {
            System.out.println("'" + bigLetterW + "'" + " - маленькая буква");
        } else if (bigLetterW >= '\u0031' && bigLetterW <= '\u0039') {
            System.out.println("'" + bigLetterW + "'" + " - является числом");
        } else {
            System.out.println("'" + bigLetterW + "'" + " - ни буква и ни цифра");
        }

        System.out.println(" ");
        System.out.println("6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        double depositSum = 321123.59;
        System.out.println("Сумма вклада " + depositSum + " руб");
        if (depositSum < 100000) {
            System.out.println("Сумма начисленных 5% " + ((depositSum / 100) * 5 + " руб"));
            System.out.println("Итоговая сумма с 5% годовых " + (depositSum + (depositSum / 100) * 
                    5) + " руб");
        }
        if (depositSum > 100000 && depositSum <= 300000) {
            System.out.println("Сумма начисленных 7% " + ((depositSum / 100) * 7 + " руб"));
            System.out.println("Итоговая сумма с 7% годовых " + (depositSum + (depositSum / 100) * 
                    7) + " руб");
        }
        if (depositSum > 300000) {
            System.out.println("Сумма начисленных 10% " + ((depositSum / 100) * 
                    10 + " руб"));
            System.out.println("Итоговая сумма с 10% годовых " + (depositSum + (depositSum / 100) *
                    10) + " руб");
        }

        System.out.println(" ");
        System.out.println("7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        int historyScores = 59;
        int pointsForProgramming = 92;
        if (historyScores <= 60) {
            System.out.println("Оценка по истории - 2");
        } else if (historyScores >= 61 && historyScores <= 71) {
            System.out.println("Оценка по истории - 3");
        } else if (historyScores >= 72 && historyScores <= 90) {
            System.out.println("Оценка по истории - 4");
        } else if (historyScores >= 91 && historyScores <= 100) {
            System.out.println("Оценка по истории - 5");
        }
        if (pointsForProgramming <= 60) {
            System.out.println("Оценка по программированию - 2");
        } else if (pointsForProgramming >= 61 && pointsForProgramming <= 71) {
            System.out.println("Оценка по программированию - 3");
        } else if (pointsForProgramming >= 72 && pointsForProgramming <= 90) {
            System.out.println("Оценка по программированию - 4");
        } else if (pointsForProgramming >= 91 && pointsForProgramming <= 100) {
            System.out.println("Оценка по программированию - 5");
        } 
        double averageGrade = (2 + 5) / 2;
        double averagePercent = (historyScores + pointsForProgramming) / 2;
        System.out.println("средний балл оценок по предметам - " + averageGrade);
        System.out.println("средний % по предметам - " + averagePercent);
       
        System.out.println(" ");
        System.out.println("8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        double monthProfit = 13025.233;
        double premisesRent = 5123.018;
        double prodCost = 9001.729;
        double annualProfit = (monthProfit * 12) - ((premisesRent * 12) + (prodCost * 12));
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
    }
}
