package ua.lviv.iot;

import ua.lviv.iot.StringProcessor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    public void setUp() {
        
        stringProcessor = new StringProcessor();
    }

    @Test
    public void threeConsonantRepWordTest() {
        assertEquals("WORDow WORDetris WORDclean processor WORDer kill",
                stringProcessor.threeConsonantRepWord("throw tttetris mvnclean processor ppper kill"));
    }

}
