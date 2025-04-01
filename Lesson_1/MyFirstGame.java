public class MyFirstGame {
    public static void main(String[] args) {
        int guess = 7;
        int secretNumber = 88;
        int min = 1;
        int max = 100;
        while (guess != secretNumber) {
            if (guess > secretNumber) {
                System.out.println("Число " + guess + " больше того, что загадал компьютер");
                max = guess - 1;
            } else {
                System.out.println("Число " + guess + " меньше того, что загадал компьютер");
                min = guess + 1;
            }
            guess = (max + min) / 2;
        }
        System.out.println("Вы угадали число " + secretNumber);
    }
}