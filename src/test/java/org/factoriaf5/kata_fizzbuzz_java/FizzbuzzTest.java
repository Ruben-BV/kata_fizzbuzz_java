package org.factoriaf5.kata_fizzbuzz_java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzbuzzTest {
    
    private Fizzbuzz fizzbuzz;

    @BeforeEach
    public void init() {
        this.fizzbuzz = new Fizzbuzz();
    }

    @Test
    public void testIsDivisibleByThree() {

        int num = 30;
        
        boolean result = fizzbuzz.isDivisibleByThree(num);

        assertTrue(result);
    }

}
