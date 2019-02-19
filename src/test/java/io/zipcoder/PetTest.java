package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void constructorTest() {
        // Given pet data
        String expected = "name";

        // When a pet is constructed with that name
        Pet pet = new Pet(expected);

        // When the pet data is retrieved from the pet
        String actual = pet.getName();

        // Then we expect the retrieved data to match the given data
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given a pet exists & a response exists
        Pet pet = new Pet("");
        String expected = "pet sound";

        // When the pet is made to speak
        String actual = pet.speak();

        // Then we expect "pet sound" to be returned from the speak method
        Assert.assertEquals(expected, actual);
    }

}
