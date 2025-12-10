package ObjectsPrac;

public class EncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        Person person2 = new Person("Jane", 25);
        Person person3 = new Person("Bob", 40);

        System.out.println(person.getAge());

        person.setName("John Doe");
        person.setAge(110);
        
        System.out.println(person.getAge());

        // person.name = "ABCD";
        System.out.println(person.getName());
        System.out.println(person2.getAge());
        System.out.println(person3.getName());


        person.display();
        person2.display();
        person3.display();
    }
}
