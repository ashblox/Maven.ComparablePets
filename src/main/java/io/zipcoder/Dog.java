package io.zipcoder;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super.name = "Doggy";
    }

    @Override
    public String speak() {
        return "woof";
    }
}
