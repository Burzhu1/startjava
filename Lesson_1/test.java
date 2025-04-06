public class test {
    public static void main(String[] args) {
       

       System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ\n");
        int checkedNum = 123321;
        int firstHalf = checkedNum / 1000;
        int secondHalf = checkedNum % 1000;

        int sumFirstHalf = 0, sumSecondHalf = 0;
        int i = firstHalf;
        int j = secondHalf;
        for (; i > 0; ) {
            sumFirstHalf += i % 10;
            sumSecondHalf += j % 10;
            i /= 10;
            j /= 10;
        }
        System.out.println("Сумма цифр " + firstHalf + " = " + sumFirstHalf);
        System.out.println("Сумма цифр " + secondHalf + " = " + sumSecondHalf);
        if (sumFirstHalf == sumSecondHalf) {
        System.out.println("Число " + checkedNum + " - счастливое");
        } else {
        System.out.println("Число " + checkedNum + " - не счастливое");
        }

    }
}