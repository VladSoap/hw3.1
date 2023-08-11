package homework21.Lesson45_47;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 1941813241665833771L;
    private  int id;
    private  String name;
    private int age;
    private byte type;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + ":" + name;
    }

}