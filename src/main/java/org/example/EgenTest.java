package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EgenTest {

    private final Egen egen = new Egen();

    @Test
    public void testConvertEtoMorse() {
        assertEquals(".", egen.englishToMorse("E"));
    }

    @Test
    public void testConvertHelloToMorse() {
        assertEquals(".... . .-.. .-.. ---", egen.englishToMorse("HELLO"));
    }

    @Test
    public void testConvertMorseToHello() {
        assertEquals("HELLO", egen.morseToEnglish(".... . .-.. .-.. ---"));
    }

    @Test
    public void testConvertLowercaseToMorse() {
        assertEquals(".-", egen.englishToMorse("a"));
    }

    @Test
    public void testEmptyInput() {
        assertEquals("", egen.englishToMorse(""));
    }
}