package io.zipcoder;

public class Dog extends Pet implements Comparable<Dog>{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super.name = "Doggy";
    }

    public int compareTo(Dog other) {
        return name.compareTo(other.name);
    }

    @Override
    public String speak() {
        return "woof";
    }
}
