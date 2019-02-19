package io.zipcoder;

public class Pet {

    public String name;

    public Pet() {
        this.name = "Pet";
    }

    public Pet (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "pet sound";
    }
}
