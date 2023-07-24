package homework15;


public class Lesson15_to_17 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Роман", 20);
        person1.sayHello();
        String s1 = "Вова";
        Person person2 = new Person();
        person2.setNameAndAge(s1, 30);
        person2.speak();
        person2.sayHello();
        //Lesson 16
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии-" + year1 + "лет");
        System.out.println("Второму человеку до пенсии-" + year2 + "лет");
    }
}

class Person {
    String name;
    int age;

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
