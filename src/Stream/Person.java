package Stream;

public class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "age: " + this.age + " Name: " + this.name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}