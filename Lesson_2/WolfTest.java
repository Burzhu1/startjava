public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.sex = "самец";
        wolfOne.nickname = "Фенрир";
        wolfOne.weight = 60;
        wolfOne.age = 4;
        wolfOne.color = "Чёрный";
        System.out.println("Пол волка " + wolfOne.sex);
        System.out.println("Кличка " + wolfOne.nickname);
        System.out.println("Вес " + wolfOne.weight);
        System.out.println("Возраст " + wolfOne.age);
        System.out.println("Окрас " + wolfOne.color);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}