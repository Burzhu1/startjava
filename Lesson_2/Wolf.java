public class Wolf {
    private String sex;
    private String nickname;
    private int weight;
    private int age;
    private String color;

    public Wolf(String sex, String nickname, int weight, int age, String color) {
        this.sex = sex;
        this.nickname = nickname;
        this.weight = weight;
        setAge(age);
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex() {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname() {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
            return;
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public void walk() {
        System.out.println("Идёт");
    }
    
    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}

