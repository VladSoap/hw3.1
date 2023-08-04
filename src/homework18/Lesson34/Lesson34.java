package homework18.Lesson34;


import homework18.Lesson34.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lesson34 {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));
        List<Dog> listOfDogs = new ArrayList<>();
        listOfAnimal.add(new Dog());
        listOfAnimal.add(new Dog());
        test(listOfAnimal);
        test(listOfDogs);

    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();

        }
    }
}
