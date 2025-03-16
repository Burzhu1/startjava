public class VariableNamesTheme {
    public static void main(String[] args) {
        System.out.println("1. РАЗНЫЕ ПЕРЕМЕННЫЕ");

        // цифра
        int digit = 1;
        System.out.println("1) Цифра " + digit);

        // сумма чисел
        int numSum = 7 + 6;
        System.out.println("2) Сумма чисел 7 + 6 = " + numSum);

        // произведение цифр
        int product = 9 * 9;
        System.out.println("3) Произведение цифр 9 на 9 = " + product);

        // максимальное число 
        int max = 2147483647;
        System.out.println("4) Максимальное число = " + max);

        // количество десятков
        int numTens = 4;
        System.out.println("5) Количество десятков в числе 47 = " + numTens + 
                " (потому что 47 = 4 десятка и 7 единиц)");

        // вес собаки
        int dogWt = 12;
        System.out.println("6) Вес собаки = " + dogWt + " кг");

        // исходное число
        int originalNum = 38;
        System.out.println("7) Исходное число = " + originalNum);

        // процент по вкладу
        int depositeInterest = 10000 * 20 / 100;
        System.out.println("8) Процент по вкладу в размере 10000 под 20 % годовых = " + depositeInterest);

        // переменная хранит символ &
        String symbol = "&";
        System.out.println("9) Переменная symbol хранит в себе знак " + symbol);

        // код ошибки
        int errorCode = 404;
        System.out.println("10) Ошибка " + errorCode);

        // тип сообщения
        String messageType = "NFC";
        System.out.println("11) Тип сообщения " + messageType);

        // число нулей
        String zeroNum = "0 0 0";
        System.out.println("12) Число нулей = " + zeroNum);

        // уникальное число
        int uniqueNum = 42;
        System.out.println("13) Уникальным числом является " + uniqueNum);

        // случайное число
        int randomNum = 6;
        System.out.println("14) Случайное число " + randomNum);

        // математическое выражение
        String mathExpression = "2 + 2";
        System.out.println("15) Математическое выражение 2 * 2 = " + mathExpression);

        // счет в игре
        int gameScore = 2;
        int gameScore1 = 5;
        System.out.println("16) " + gameScore + " : " + gameScore1);

        // максимальная длина
        int maxLength = 200;
        System.out.println("17) Максимальная длина = " + maxLength + " метров");

        // пункт меню
        int menuItem = 1;
        System.out.println("18) " + menuItem + ". Чай зелёный");

        // стоимость кофе
        int cofeCost = 200;
        System.out.println("19) Цена кофе равняется " + cofeCost + " рублей");

        // начальная дата
        int startingDate = 2000;
        System.out.println("20) Дата начала 21 века " + startingDate + " год");

        // окончание диапазона
        String rangeEnd = "Конец интервала = с6 + 5";
        System.out.println("21) " + rangeEnd);

        // имя работника месяца
        String employeeOfTheMonth = "Роберт";
        System.out.println("22) Работник месяца ==> " + employeeOfTheMonth);

        // название электронной книги
        String ebookTitle = "Тихий Дэн";
        System.out.println("23) Электронная книга называется " + ebookTitle);

        // размер
        int size = 20;
        System.out.println("24) Размер составляет " + size + " на 60");

        // вместимость
        int capacity = 33;
        System.out.println("25) Вместимость фуры составляет " + capacity + " палеты");

        // счетчик
        int counter1 = 1;
        int counter2 = 2;
        int counter3 = 3;
        int counter4 = 4;
        int counter5 = 5;
        System.out.println("26) Счёт от 1 до 5 = " + counter1 + ", " + counter2 + ", " + 
                counter3 + ", " + counter4 + ", " + counter5);

        // путь до файла
        String filePath = ("VariableNamesTheme.java");
        System.out.println("27) Адрес файла " + filePath);

        // количество чисел в каждой строке
        int numbersPerRow = 50;
        System.out.println("28) Всего в каждой строке " + numbersPerRow + " чисел");

        System.out.println("\n2. BOOLEAN-ПЕРЕМЕННЫЕ\n");

        // сотни равны?
        boolean isEqualHundreds = false;
        System.out.println("1) 100 >< 200 = " + isEqualHundreds);

        // компьютер включен?
        boolean compActive = true;
        System.out.println("2) Компьютер включен? = " + compActive);

        // есть равные цифры?
        boolean isEqualDigits = true;
        System.out.println("3) Равны ли цифры 2,2,2,2 = " + isEqualDigits);

        // создано?
        boolean isCreated = true;
        System.out.println("4) Создано = " + isCreated);

        // пустое?
        boolean isEmpty = true;
        System.out.println("5) Является пустым = " + isEmpty);

        // активное?
        boolean isActive = true;
        System.out.println("6) Активное = " + isActive);

        // новое?
        boolean isNew = true;
        System.out.println("7) Является новым = " + isNew);

        // электронная почта действительная?
        boolean isValidEmail = false;
        System.out.println("8) Электронная почта действительная? === " + isValidEmail);

        // имеются уникальные строки?
        boolean isUniqueStrings = false;
        System.out.println("9) Наличие уникальных строк = " + isUniqueStrings);

        System.out.println("\n3. АББРЕВИАТУРЫ\n");

        // старый universally unique identifier
        String oldUuid = "1) universally unique identifier";
        System.out.println(oldUuid);

        // производитель оперативной памяти
        String ramManufacturer = "2) Manufacturer of random-access memory";
        System.out.println(ramManufacturer);

        // емкость жесткого диска
        String hddCapacity = "3) hard disk capacity";
        System.out.println(hddCapacity);

        // протокол передачи гипертекста
        String httpProtocol = "4) hypertext transfer protocol";
        System.out.println(httpProtocol);

        // Адрес ресурса uniform resource locator
        String url = "5) uniform resource locator";
        System.out.println(url);

        // новый идентификатор клиента
        String newId = "6) new client ID";
        System.out.println(newId);

        // american standard code for information interchange
        String ascii = "7) american standard code for information interchange";
        System.out.println(ascii);
    } 
}