package io.zipcoder;

public class Fish extends Pet {

    public Fish(String name) {
        super(name);
    }

    public Fish() {
        super.name = "Fish";
    }

    @Override
    public String speak() {
        return "blub";
    }
}
