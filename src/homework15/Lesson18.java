package homework15;

public class Lesson18 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setName("Имя");
        person1.setAge(12);
        System.out.println("Значение в main методе - " + person1.getName());
        System.out.println("Значение в main методе - " + person1.getAge());


    }
}

class Person1 {
    private String name;
    private int age;

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Ввёл пустое имя");
        } else {
            name = username;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть больше 0");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void speak() {

        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + "," + "мне " + age + "лет");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }

    //Lesson 16
    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    //Lesson 17
    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }
}
