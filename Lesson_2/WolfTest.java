public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf("самец", "Фенрир", 60, 4, "Чёрный");

        String wolfOneSex = wolfOne.getSex();
        String wolfOneNickname = wolfOne.getNickname();
        int wolfOneWeight = wolfOne.getWeight();
        int wolfOneAge = wolfOne.getAge();
        String wolfOneColor = wolfOne.getColor();

        System.out.println("Пол волка: " + wolfOneSex);
        System.out.println("Кличка: " + wolfOneNickname);
        System.out.println("Вес: " + wolfOneWeight);
        System.out.println("Возраст: " + wolfOneAge);
        System.out.println("Окрас: " + wolfOneColor);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}