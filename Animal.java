public class Animal {
    String animalName;
    String ownerName;
    int age;

    public Animal() {
    }

    public Animal(String animalName, String ownerName, int age) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        this.age = age;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal [animalName=" + animalName + ", ownerName=" + ownerName + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (!(obj instanceof Animal))
            return false;

        Animal a = (Animal) obj;

        return this.age == a.age &&
                this.animalName.equals(a.animalName) &&
                this.ownerName.equals(a.ownerName);
    }
}
