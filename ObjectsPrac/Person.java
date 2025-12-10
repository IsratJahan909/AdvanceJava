package ObjectsPrac;

public class Person {
    private String name; // Encapsulated field
    private int age;

    public Person(String namePr, int agePr) {
        this.name = namePr;
        this.age = agePr;
    }

    public void display() {
        System.out.println("Age: " + age + ", Name: " + name );
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    
}
