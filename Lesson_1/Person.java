public class Person {
    String sex = "мужской";
    String name = "Иван";
    int height = 182;
    int weight = 70;
    int age = 44;
    
    public void walk() {
        System.out.println("скорость шага - 6 км/ч");
    }

    public void sit() {
        System.out.println("Может сидеть");
    }

    public void run() {
        System.out.println("скорость бега - 12 км/ч");
    }

    public void talk() {
        System.out.println("Может говорить");
    }

    public void learnJava() {
        System.out.println("Может учить Java");
    }
}