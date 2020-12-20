package com.springboot;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class StudentApplicationTest {

    private static final double EXPECTED_RESULT = 3.1416;
    private StudentApplication sut = new StudentApplication();

    @Test
    void justAnExample() {
        assertTrue(true);
    }

    @Test
    void justAnExample2() throws IOException {
        assertNotNull("not null");
        assertEquals(EXPECTED_RESULT, sut.retrieveResult());
    }

    @Test
    void simpleTest() throws IOException {
        System.out.println("Run simpleTest at" + LocalDateTime.now());
    }
}

