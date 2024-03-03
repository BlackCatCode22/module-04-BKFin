package ZooApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // local variables
        String name = "NeedName";
        String species;
        int age;

        // ArrayList of Animal objects
        ArrayList<Animal> animals = new ArrayList<>();

        // HashMap will be holding animal count

        HashMap<String, Integer> animalCount = new HashMap<>();

        // Open an external file, parse it line by line, and get age and species
        String filePath = "./ZooApp/arrivingAnimals.txt";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Age is in the first element of the array named parts
                String[] parts = line.split(", ");

                // Check if the line has at least 1 part
                if (parts.length >= 1) {
                    String ageAndSpecies = parts[0];
                    System.out.println("ageAndSpecies: " + ageAndSpecies);

                    // Get age out of 'ageAndSpecies'
                    String[] theParts = ageAndSpecies.split(" ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("theParts[" + i + "] is " + theParts[i]);
                    }
                    age = Integer.parseInt(theParts[0]);
                    species = theParts[4];

                    // Create a new animal object.
                    Animal myAnimal = new Animal(name, age, species);

                    // Add the new Animal object to the ArrayList of Animals
                    animals.add(myAnimal);
                }
                System.out.println("\n Number of animals is: " + Animal.numOfAnimals);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }

        // We now have an arrayList of Animals. Let's output them!
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println("Animal name: " + animal.getName() + ", Age: " + animal.getAge() + ", Species: "
                    + animal.getSpecies());
        }
        System.out.println("\n Number of animals is: " + Animal.numOfAnimals);

        // Parse the animalNames.txt file and pull the names separated by commas
        // Then use the setter to overwrite the names in the ArrayList

        try {
            Scanner scanner = new Scanner(new File("./ZooApp/animalNames.txt")).useDelimiter(",");
            String result = scanner.next();
            for (Animal animal : animals) {
                if (result != null) {
                    animal.setName(result);
                    result = scanner.next();
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the report

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./ZooApp/newAnimals.txt"));
            String animalReport;
            for (Animal animal : animals) {
                animalReport = ("\n" + "[Animal] " + animal.getSpecies() + " [Name] " + animal.getName() + " [Age] "
                        + animal.getAge());
                writer.write(animalReport);
            }
            writer.write("\n" + "Current Species Count: ");
            for (Animal animal : animals) {
                String animalType = animal.getSpecies();
                animalCount.put(animalType, animalCount.getOrDefault(animalType, 0) + 1);
            }
            writer.write(animalCount.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
