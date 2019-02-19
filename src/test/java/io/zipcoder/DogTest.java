package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void constructorTest() {
        // Given dog data
        String expected = "Otis";

        // When a dog is constructed
        Dog dog = new Dog(expected);

        // When the name is retrieved from the dog
        String actual = dog.getName();

        // Then we expect the given name to match the retrieved name
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given a dog exists and an expected dog sound exists
        Dog dog = new Dog("name");
        String expected = "woof";

        // When a dog is made to speak
        String actual = dog.speak();

        // Then we expect the given sound to match the retrieved sound
        Assert.assertEquals(expected, actual);
    }
}
