package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    @Test
    public void constructorTest() {
        // Given fish data
        String expected = "Goldy";

        // When a fish is constructed
        Fish fish = new Fish(expected);

        // When the name is retrieved from the fish
        String actual = fish.getName();

        // Then we expect the given name to match the retrieved name
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given a fish exists and there is an expected sound
        Fish fish = new Fish("name");
        String expected = "blub";

        // When a fish is made to speak
        String actual = fish.speak();

        // Then the expected sound should match the sound returned from the speak method
        Assert.assertEquals(expected, actual);
    }

}
