package io.zipcoder;


import java.util.HashMap;
import java.util.Map;

public class Application {

    public static IOConsole ioconsole = new IOConsole();

    public static void main(String[] args) {
        Integer numberOfPets = ioconsole.getIntegerInput("How many pets do you have?");
        Map<Pet, String> pets = new HashMap<Pet, String>();
        for (int i = 0; i < numberOfPets; i++) {
            String petType = ioconsole.getStringInput("What kind of pet is it?");
            petType = petType.toLowerCase();
            if (petType.equals("dog") == false && petType.equals("cat") == false && petType.equals("fish") == false) {
                ioconsole.print("Invalid pet type. ");
                i = i - 1;
            } else if (petType.equals("dog")) {
                String petsName = ioconsole.getStringInput("What is it's name?");
                Pet dog = new Dog(petsName);
                pets.put(dog, petsName);
            } else if (petType.equals("cat")) {
                String petsName = ioconsole.getStringInput("What is it's name?");
                Pet cat = new Cat(petsName);
                pets.put(cat, petsName);
            } else {
                String petsName = ioconsole.getStringInput("What is it's name?");
                Pet fish = new Fish(petsName);
                pets.put(fish, petsName);
            }
        }
        String allPets = "";
        for (Map.Entry<Pet, String> entry: pets.entrySet()) {
            allPets += String.format("%s %s ", entry.getValue(), entry.getKey().speak());
        }
        allPets = allPets.trim();
        ioconsole.println(allPets);
    }

}
