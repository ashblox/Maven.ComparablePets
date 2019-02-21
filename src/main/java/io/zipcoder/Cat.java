package io.zipcoder;

public class Cat extends Pet implements Comparable<Cat>{

    public Cat(String name) {
        super(name);
    }

    public int compareTo(Cat other) {
        return name.compareTo(other.name);
    }

    public Cat() {
        super.name = "Kitty";
    }

    @Override
    public String speak() {
        return "meow";
    }
}
