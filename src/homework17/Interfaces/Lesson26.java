package homework17.Interfaces;

public class Lesson26 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outputInfo(animal1);
        outputInfo(animal1);

    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
