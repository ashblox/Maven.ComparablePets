package io.zipcoder;

public class Fish extends Pet implements Comparable<Fish> {

    public Fish(String name) {
        super(name);
    }

    public Fish() {
        super.name = "Fish";
    }

    public int compareTo(Fish other) {
        return name.compareTo(other.name);
    }

    @Override
    public String speak() {
        return "blub";
    }
}
