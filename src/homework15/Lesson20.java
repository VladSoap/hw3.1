package homework15;

public class Lesson20 {
    public static void main(String[] args) {
        Human1 human1 = new Human1("Bob");


    }
}

class Human1 {
    private String name;
    private int age;

    public Human1() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human1(String name) {
        System.out.println("Конструктор 2");
        this.name = name;
    }

    public Human1(String name, int age) {
        System.out.println("Конструктор 3");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
