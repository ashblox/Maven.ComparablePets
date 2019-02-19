package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void constructorTest() {
        // Given cat data
        String expected = "Milo";

        // When a cat is constructed
        Cat cat = new Cat(expected);

        // When we retrieve the data from the cat
        String actual = cat.getName();

        // Then we expect the given data to match the retrieved data
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given a cat exists and an there is an expected sound
        Cat cat = new Cat("name");
        String expected = "meow";

        // When a cat is made to speak
        String actual = cat.speak();

        // Then the expected sound should match the sound returned by the speak method
        Assert.assertEquals(expected, actual);
    }
}
