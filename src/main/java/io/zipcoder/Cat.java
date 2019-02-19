package io.zipcoder;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super.name = "Kitty";
    }

    @Override
    public String speak() {
        return "meow";
    }
}
