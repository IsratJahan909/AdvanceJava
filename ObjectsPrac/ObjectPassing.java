package ObjectsPrac;

public class ObjectPassing {
    public static void changeName(Dog d) {
        d.name = "ChangedName";
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        System.out.println("Before: " + myDog.name);
        changeName(myDog);
        System.out.println("After: " + myDog.name);
    }
}
