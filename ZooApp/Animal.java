package ZooApp;

public class Animal {

    String name;
    int age;
    String species;

    // Global variable specific to Animal class

    public static int numOfAnimals = 0;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        numOfAnimals++;
    }

    // Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

// Individual sub-classes with their own getters/setters

class Bear extends Animal {

    int howManyCubs;

    public Bear(String name, int age, int howManyCubs) {
        super(name, age, "Bear");
        this.howManyCubs = howManyCubs;

    }

    public int getHowManyCubs() {
        return howManyCubs;
    }

    public void setHowManyCubs(int howManyCubs) {
        this.howManyCubs = howManyCubs;
    }

}

class Hyena extends Animal {

    int spots;

    public Hyena(String name, int age, int spots) {
        super(name, age, "Hyena");
        this.spots = spots;
    }

    public int getSpots() {
        return spots;
    }

    public void setSpots(int spots) {
        this.spots = spots;
    }

}

class Lion extends Animal {

    String maneColor;

    public Lion(String name, int age, String maneColor) {
        super(name, age, "Lion");
        this.maneColor = maneColor;
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

}

class Tiger extends Animal {

    int stripes;

    public Tiger(String name, int age, int stripes) {
        super(name, age, "Tiger");
        this.stripes = stripes;
    }

    public int getStripes() {
        return stripes;
    }

    public void setStripes(int stripes) {
        this.stripes = stripes;
    }

}
