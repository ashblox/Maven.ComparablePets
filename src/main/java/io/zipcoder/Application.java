package io.zipcoder;


import java.util.*;

public class Application {

    public static IOConsole ioconsole = new IOConsole();

    public static void main(String[] args) {
        Integer numberOfPets = ioconsole.getIntegerInput("How many pets do you have?");
        Map<Pet, String> pets = new HashMap<Pet, String>();
        for (int i = 0; i < numberOfPets; i++) {
            String petType = ioconsole.getStringInput("What kind of pet is it?");
            petType = petType.toLowerCase();
            if (petType.equals("dog")) {
                String petsName = ioconsole.getStringInput("What is it's name?");
                Pet dog = new Dog(petsName);
                pets.put(dog, petsName);
            } else if (petType.equals("cat")) {
                String petsName = ioconsole.getStringInput("What is it's name?");
                Pet cat = new Cat(petsName);
                pets.put(cat, petsName);
            } else if (petType.equals("fish")) {
                String petsName = ioconsole.getStringInput("What is it's name?");
                Pet fish = new Fish(petsName);
                pets.put(fish, petsName);
            } else {
                ioconsole.print("Invalid pet type. ");
                i = i - 1;
            }
        }

//        String allPets = "";
//        for (Map.Entry<Pet, String> entry: pets.entrySet()) {
//            allPets += String.format("%s %s ", entry.getValue(), entry.getKey().speak());
//        }
//
//        allPets = allPets.trim();
//        ioconsole.println(allPets);

        Map<Pet, String> sorted = new TreeMap<Pet, String>(new PetComparator<Pet>());
        sorted.putAll(pets);

        String sortedPets = "";
        for (Map.Entry<Pet, String> entry: sorted.entrySet()) {
            sortedPets += String.format("%s %s ", entry.getValue(), entry.getKey().speak());
        }

        sortedPets = sortedPets.trim();
        ioconsole.println(sortedPets);
    }

}
