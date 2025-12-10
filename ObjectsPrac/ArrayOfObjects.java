package ObjectsPrac;

public class ArrayOfObjects {
     public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Alice", 1);
        persons[1] = new Person("Bob", 2);
        persons[2] = new Person("Charlie", 3);

        for (Person s : persons) {
            s.display();
        }
    }
}
