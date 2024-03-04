# Design & Implementation

## Design

- Create Animal.java file
    - Have to create Animal super class
    - Getters & Setters
    - Subclasses
        - Unique attribute per subclass
        - Setters and getters for the subclasses

- Create Main.java
    - Need to create an array of animal objects
    - Need to keep track of the number of different animals
    - Use File IO to read in txt files and use the data to create animal objects
    - Output the manipulated data into a report text file called newAnimals.txt

## Implementation

- Created the Animal.java file
    - Created Animal superclass with species, name, and age attributes
    - Created Setters & Getters
    - Created Subclasses for Hyena, Bear, Lion & Tiger
        - Created a unique attribute for each subclass
        - Created setters & getters for the subclass attributes

- Created Main.java
    - Used ArrayList to hold an array of objects built off the Animal superclass
    - Used a HashMap to hold the number of each type of species
    - Used the Scanner and BufferedWriters classes to read input files and output request report file

**Make sure to Comment Code!**