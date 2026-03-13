public class Dog extends Animal {
    String breed;

    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog [animalName=" + animalName + ", breed=" + breed + ", ownerName=" + ownerName + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (!(obj instanceof Dog))
            return false;

        Dog d = (Dog) obj;

        return super.equals(d) &&
                this.breed.equals(d.breed);
    }
}
