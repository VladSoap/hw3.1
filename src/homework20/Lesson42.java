package homework20;

public class Lesson42 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello123".substring(0, 5);

        System.out.println(b);
        System.out.println(a == b);
    }

}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;

    }
}