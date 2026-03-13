public class AnimalTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bobik", "Bob", 6, "Labrador");
        Dog d2 = new Dog("Buddy", "Alice", 7, "Labrador");

        System.out.println(d1);
        System.out.println("Dogs equal: " + d1.equals(d2));

        Animal a = new Animal("Bobik", "Bob", -3);
    }
}